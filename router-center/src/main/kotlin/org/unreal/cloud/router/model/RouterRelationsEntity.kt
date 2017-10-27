package org.unreal.cloud.router.model

import com.fasterxml.jackson.annotation.JsonIgnore
import java.io.Serializable
import java.sql.Timestamp
import javax.persistence.*

@Entity
@Table(name = "router_relations", schema = "unreal_router")
class RouterRelationsEntity : Serializable{
    @get:Id
    @get:GeneratedValue
    @get:Column(name = "id")
    var id: Long = 0
    @get:Basic
    @get:Column(name = "service_id")
    var serviceId: Int = 0
    @JsonIgnore
    @get:Basic
    @get:Column(name = "client_id")
    var clientId: Int = 0
    @get:Column(name = "description")
    var description: String? = null
    @JsonIgnore
    @get:Basic
    @get:Column(name = "crt_time")
    var crtTime: Timestamp? = Timestamp(System.currentTimeMillis())
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
    var updTime: Timestamp? = null
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
        if (javaClass != other?.javaClass) return false

        other as RouterRelationsEntity

        if (id != other.id) return false
        if (serviceId != other.serviceId) return false
        if (clientId != other.clientId) return false
        if (description != other.description) return false
        if (crtTime != other.crtTime) return false
        if (crtUser != other.crtUser) return false
        if (crtName != other.crtName) return false
        if (crtHost != other.crtHost) return false
        if (updTime != other.updTime) return false
        if (updUser != other.updUser) return false
        if (updName != other.updName) return false
        if (updHost != other.updHost) return false
        if (attr1 != other.attr1) return false
        if (attr2 != other.attr2) return false
        if (attr3 != other.attr3) return false
        if (attr4 != other.attr4) return false
        if (attr5 != other.attr5) return false
        if (attr6 != other.attr6) return false
        if (attr7 != other.attr7) return false
        if (attr8 != other.attr8) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + (serviceId?.hashCode() ?: 0)
        result = 31 * result + (clientId?.hashCode() ?: 0)
        result = 31 * result + (description?.hashCode() ?: 0)
        result = 31 * result + (crtTime?.hashCode() ?: 0)
        result = 31 * result + (crtUser?.hashCode() ?: 0)
        result = 31 * result + (crtName?.hashCode() ?: 0)
        result = 31 * result + (crtHost?.hashCode() ?: 0)
        result = 31 * result + (updTime?.hashCode() ?: 0)
        result = 31 * result + (updUser?.hashCode() ?: 0)
        result = 31 * result + (updName?.hashCode() ?: 0)
        result = 31 * result + (updHost?.hashCode() ?: 0)
        result = 31 * result + (attr1?.hashCode() ?: 0)
        result = 31 * result + (attr2?.hashCode() ?: 0)
        result = 31 * result + (attr3?.hashCode() ?: 0)
        result = 31 * result + (attr4?.hashCode() ?: 0)
        result = 31 * result + (attr5?.hashCode() ?: 0)
        result = 31 * result + (attr6?.hashCode() ?: 0)
        result = 31 * result + (attr7?.hashCode() ?: 0)
        result = 31 * result + (attr8?.hashCode() ?: 0)
        return result
    }


}