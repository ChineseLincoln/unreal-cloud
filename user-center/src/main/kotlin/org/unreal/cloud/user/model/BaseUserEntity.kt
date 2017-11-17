package org.unreal.cloud.user.model

import com.fasterxml.jackson.annotation.JsonIgnore

import javax.persistence.*
import java.sql.Timestamp

@Entity
@Table(name = "base_user", schema = "ag_admin")
class BaseUserEntity {
    @get:Id
    @get:GeneratedValue
    @get:Column(name = "id")
    var id: Int = 0
    @get:Basic
    @get:Column(name = "account")
    var account: String? = null
    @JsonIgnore
    @get:Basic
    @get:Column(name = "password")
    var password: String? = null
    @get:Basic
    @get:Column(name = "name")
    var name: String? = null
    @get:Basic
    @get:Column(name = "birthday")
    var birthday: String? = null
    @get:Basic
    @get:Column(name = "address")
    var address: String? = null
    @get:Basic
    @get:Column(name = "mobile_phone")
    var mobilePhone: String? = null
    @get:Basic
    @get:Column(name = "tel_phone")
    var telPhone: String? = null
    @get:Basic
    @get:Column(name = "email")
    var email: String? = null
    @get:Basic
    @get:Column(name = "sex")
    var sex: String? = null
    @get:Basic
    @get:Column(name = "type")
    var type: String? = null
    @get:Basic
    @get:Column(name = "status")
    var status: String? = null
    @get:Basic
    @get:Column(name = "description")
    var description: String? = null
    @JsonIgnore
    @get:Basic
    @get:Column(name = "crt_time")
    var crtTime: java.sql.Timestamp? = Timestamp(System.currentTimeMillis())
    @JsonIgnore
    @get:Basic
    @get:Column(name = "crt_user")
    var crtUser: String? = null
    @JsonIgnore
    @get:Basic
    @get:Column(name = "crt_name")
    var crtName: String? = null
    @JsonIgnore
    @get:Basic
    @get:Column(name = "crt_host")
    var crtHost: String? = null
    @JsonIgnore
    @get:Basic
    @get:Column(name = "upd_time")
    var updTime: java.sql.Timestamp? = null
    @JsonIgnore
    @get:Basic
    @get:Column(name = "upd_user")
    var updUser: String? = null
    @JsonIgnore
    @get:Basic
    @get:Column(name = "upd_name")
    var updName: String? = null
    @JsonIgnore
    @get:Basic
    @get:Column(name = "upd_host")
    var updHost: String? = null
    @JsonIgnore
    @get:Basic
    @get:Column(name = "attr1")
    var attr1: String? = null
    @JsonIgnore
    @get:Basic
    @get:Column(name = "attr2")
    var attr2: String? = null
    @JsonIgnore
    @get:Basic
    @get:Column(name = "attr3")
    var attr3: String? = null
    @JsonIgnore
    @get:Basic
    @get:Column(name = "attr4")
    var attr4: String? = null
    @JsonIgnore
    @get:Basic
    @get:Column(name = "attr5")
    var attr5: String? = null
    @JsonIgnore
    @get:Basic
    @get:Column(name = "attr6")
    var attr6: String? = null
    @JsonIgnore
    @get:Basic
    @get:Column(name = "attr7")
    var attr7: String? = null
    @JsonIgnore
    @get:Basic
    @get:Column(name = "attr8")
    var attr8: String? = null

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || javaClass != other.javaClass) return false
        if (!super.equals(other)) return false

        val that = other as BaseUserEntity?

        if (id != that!!.id) return false
        if (if (account != null) account != that.account else that.account != null) return false
        if (if (password != null) password != that.password else that.password != null) return false
        if (if (name != null) name != that.name else that.name != null) return false
        if (if (birthday != null) birthday != that.birthday else that.birthday != null) return false
        if (if (address != null) address != that.address else that.address != null) return false
        if (if (mobilePhone != null) mobilePhone != that.mobilePhone else that.mobilePhone != null) return false
        if (if (telPhone != null) telPhone != that.telPhone else that.telPhone != null) return false
        if (if (email != null) email != that.email else that.email != null) return false
        if (if (sex != null) sex != that.sex else that.sex != null) return false
        if (if (type != null) type != that.type else that.type != null) return false
        if (if (status != null) status != that.status else that.status != null) return false
        if (if (description != null) description != that.description else that.description != null) return false
        if (if (crtTime != null) !crtTime!!.equals(that.crtTime) else that.crtTime != null) return false
        if (if (crtUser != null) crtUser != that.crtUser else that.crtUser != null) return false
        if (if (crtName != null) crtName != that.crtName else that.crtName != null) return false
        if (if (crtHost != null) crtHost != that.crtHost else that.crtHost != null) return false
        if (if (updTime != null) !updTime!!.equals(that.updTime) else that.updTime != null) return false
        if (if (updUser != null) updUser != that.updUser else that.updUser != null) return false
        if (if (updName != null) updName != that.updName else that.updName != null) return false
        if (if (updHost != null) updHost != that.updHost else that.updHost != null) return false
        if (if (attr1 != null) attr1 != that.attr1 else that.attr1 != null) return false
        if (if (attr2 != null) attr2 != that.attr2 else that.attr2 != null) return false
        if (if (attr3 != null) attr3 != that.attr3 else that.attr3 != null) return false
        if (if (attr4 != null) attr4 != that.attr4 else that.attr4 != null) return false
        if (if (attr5 != null) attr5 != that.attr5 else that.attr5 != null) return false
        if (if (attr6 != null) attr6 != that.attr6 else that.attr6 != null) return false
        if (if (attr7 != null) attr7 != that.attr7 else that.attr7 != null) return false
        return if (if (attr8 != null) attr8 != that.attr8 else that.attr8 != null) false else true

    }

    override fun hashCode(): Int {
        var result = super.hashCode()
        result = 31 * result + id
        result = 31 * result + if (account != null) account!!.hashCode() else 0
        result = 31 * result + if (password != null) password!!.hashCode() else 0
        result = 31 * result + if (name != null) name!!.hashCode() else 0
        result = 31 * result + if (birthday != null) birthday!!.hashCode() else 0
        result = 31 * result + if (address != null) address!!.hashCode() else 0
        result = 31 * result + if (mobilePhone != null) mobilePhone!!.hashCode() else 0
        result = 31 * result + if (telPhone != null) telPhone!!.hashCode() else 0
        result = 31 * result + if (email != null) email!!.hashCode() else 0
        result = 31 * result + if (sex != null) sex!!.hashCode() else 0
        result = 31 * result + if (type != null) type!!.hashCode() else 0
        result = 31 * result + if (status != null) status!!.hashCode() else 0
        result = 31 * result + if (description != null) description!!.hashCode() else 0
        result = 31 * result + if (crtTime != null) crtTime!!.hashCode() else 0
        result = 31 * result + if (crtUser != null) crtUser!!.hashCode() else 0
        result = 31 * result + if (crtName != null) crtName!!.hashCode() else 0
        result = 31 * result + if (crtHost != null) crtHost!!.hashCode() else 0
        result = 31 * result + if (updTime != null) updTime!!.hashCode() else 0
        result = 31 * result + if (updUser != null) updUser!!.hashCode() else 0
        result = 31 * result + if (updName != null) updName!!.hashCode() else 0
        result = 31 * result + if (updHost != null) updHost!!.hashCode() else 0
        result = 31 * result + if (attr1 != null) attr1!!.hashCode() else 0
        result = 31 * result + if (attr2 != null) attr2!!.hashCode() else 0
        result = 31 * result + if (attr3 != null) attr3!!.hashCode() else 0
        result = 31 * result + if (attr4 != null) attr4!!.hashCode() else 0
        result = 31 * result + if (attr5 != null) attr5!!.hashCode() else 0
        result = 31 * result + if (attr6 != null) attr6!!.hashCode() else 0
        result = 31 * result + if (attr7 != null) attr7!!.hashCode() else 0
        result = 31 * result + if (attr8 != null) attr8!!.hashCode() else 0
        return result
    }
}
