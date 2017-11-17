package org.unreal.cloud.jwt

import java.io.*
import java.security.*
import java.security.spec.PKCS8EncodedKeySpec
import java.security.spec.X509EncodedKeySpec

/**
 * Created by ace on 2017/9/10.
 */
object KeyHelper {
    /**
     * 获取公钥
     * @param filename
     * @return
     * @throws Exception
     */
    @Throws(Exception::class)
    fun getPublicKey(filename: String): PublicKey {
        val f = File(filename)
        val fis = FileInputStream(f)
        val dis = DataInputStream(fis)
        val keyBytes = ByteArray(f.length().toInt())
        dis.readFully(keyBytes)
        dis.close()
        val spec = X509EncodedKeySpec(keyBytes)
        val kf = KeyFactory.getInstance("RSA")
        return kf.generatePublic(spec)
    }

    /**
     * 获取密钥
     * @param filename
     * @return
     * @throws Exception
     */
    @Throws(Exception::class)
    fun getPrivateKey(filename: String): PrivateKey {
        val f = File(filename)
        val fis = FileInputStream(f)
        val dis = DataInputStream(fis)
        val keyBytes = ByteArray(f.length().toInt())
        dis.readFully(keyBytes)
        dis.close()
        val spec = PKCS8EncodedKeySpec(keyBytes)
        val kf = KeyFactory.getInstance("RSA")
        return kf.generatePrivate(spec)
    }

    /**
     * 生存rsa公钥和密钥
     * @param publicKeyFilename
     * @param privateKeyFilename
     * @param password
     * @throws IOException
     * @throws NoSuchAlgorithmException
     */
    @Throws(IOException::class, NoSuchAlgorithmException::class)
    fun generateKey(publicKeyFilename: String, privateKeyFilename: String, password: String) {
        val keyPairGenerator = KeyPairGenerator.getInstance("RSA")
        val secureRandom = SecureRandom(password.toByteArray())
        keyPairGenerator.initialize(1024, secureRandom)
        val keyPair = keyPairGenerator.genKeyPair()
        val publicKeyBytes = keyPair.public.encoded
        var fos = FileOutputStream(publicKeyFilename)
        fos.write(publicKeyBytes)
        fos.close()
        val privateKeyBytes = keyPair.private.encoded
        fos = FileOutputStream(privateKeyFilename)
        fos.write(privateKeyBytes)
        fos.close()
    }

    @Throws(IOException::class, NoSuchAlgorithmException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        generateKey("./pub.key", "./pri.key", "1*&623!f")
    }
}

