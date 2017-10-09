@javax.persistence.Entity
@javax.persistence.Table(name = "base_group_member", schema = "ag_admin", catalog = "")
public class BaseGroupMemberEntity {
    private int id;
    private String groupId;
    private String userId;
    private String description;
    private Timestamp crtTime;
    private String crtUser;
    private String crtName;
    private String crtHost;
    private Timestamp updTime;
    private String updUser;
    private String updName;
    private String updHost;
    private String attr1;
    private String attr2;
    private String attr3;
    private String attr4;
    private String attr5;
    private String attr6;
    private String attr7;
    private String attr8;

    @javax.persistence.Id
    @javax.persistence.Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "group_id")
    public java.lang.String getGroupId() {
        return groupId;
    }

    public void setGroupId(java.lang.String groupId) {
        this.groupId = groupId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "user_id")
    public java.lang.String getUserId() {
        return userId;
    }

    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "description")
    public java.lang.String getDescription() {
        return description;
    }

    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "crt_time")
    public java.sql.Timestamp getCrtTime() {
        return crtTime;
    }

    public void setCrtTime(java.sql.Timestamp crtTime) {
        this.crtTime = crtTime;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "crt_user")
    public java.lang.String getCrtUser() {
        return crtUser;
    }

    public void setCrtUser(java.lang.String crtUser) {
        this.crtUser = crtUser;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "crt_name")
    public java.lang.String getCrtName() {
        return crtName;
    }

    public void setCrtName(java.lang.String crtName) {
        this.crtName = crtName;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "crt_host")
    public java.lang.String getCrtHost() {
        return crtHost;
    }

    public void setCrtHost(java.lang.String crtHost) {
        this.crtHost = crtHost;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "upd_time")
    public java.sql.Timestamp getUpdTime() {
        return updTime;
    }

    public void setUpdTime(java.sql.Timestamp updTime) {
        this.updTime = updTime;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "upd_user")
    public java.lang.String getUpdUser() {
        return updUser;
    }

    public void setUpdUser(java.lang.String updUser) {
        this.updUser = updUser;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "upd_name")
    public java.lang.String getUpdName() {
        return updName;
    }

    public void setUpdName(java.lang.String updName) {
        this.updName = updName;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "upd_host")
    public java.lang.String getUpdHost() {
        return updHost;
    }

    public void setUpdHost(java.lang.String updHost) {
        this.updHost = updHost;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "attr1")
    public java.lang.String getAttr1() {
        return attr1;
    }

    public void setAttr1(java.lang.String attr1) {
        this.attr1 = attr1;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "attr2")
    public java.lang.String getAttr2() {
        return attr2;
    }

    public void setAttr2(java.lang.String attr2) {
        this.attr2 = attr2;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "attr3")
    public java.lang.String getAttr3() {
        return attr3;
    }

    public void setAttr3(java.lang.String attr3) {
        this.attr3 = attr3;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "attr4")
    public java.lang.String getAttr4() {
        return attr4;
    }

    public void setAttr4(java.lang.String attr4) {
        this.attr4 = attr4;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "attr5")
    public java.lang.String getAttr5() {
        return attr5;
    }

    public void setAttr5(java.lang.String attr5) {
        this.attr5 = attr5;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "attr6")
    public java.lang.String getAttr6() {
        return attr6;
    }

    public void setAttr6(java.lang.String attr6) {
        this.attr6 = attr6;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "attr7")
    public java.lang.String getAttr7() {
        return attr7;
    }

    public void setAttr7(java.lang.String attr7) {
        this.attr7 = attr7;
    }

    @javax.persistence.Basic
    @javax.persistence.Column(name = "attr8")
    public java.lang.String getAttr8() {
        return attr8;
    }

    public void setAttr8(java.lang.String attr8) {
        this.attr8 = attr8;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        BaseGroupMemberEntity that = (BaseGroupMemberEntity) object;

        if (id != that.id) return false;
        if (groupId != null ? !groupId.equals(that.groupId) : that.groupId != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (crtTime != null ? !crtTime.equals(that.crtTime) : that.crtTime != null) return false;
        if (crtUser != null ? !crtUser.equals(that.crtUser) : that.crtUser != null) return false;
        if (crtName != null ? !crtName.equals(that.crtName) : that.crtName != null) return false;
        if (crtHost != null ? !crtHost.equals(that.crtHost) : that.crtHost != null) return false;
        if (updTime != null ? !updTime.equals(that.updTime) : that.updTime != null) return false;
        if (updUser != null ? !updUser.equals(that.updUser) : that.updUser != null) return false;
        if (updName != null ? !updName.equals(that.updName) : that.updName != null) return false;
        if (updHost != null ? !updHost.equals(that.updHost) : that.updHost != null) return false;
        if (attr1 != null ? !attr1.equals(that.attr1) : that.attr1 != null) return false;
        if (attr2 != null ? !attr2.equals(that.attr2) : that.attr2 != null) return false;
        if (attr3 != null ? !attr3.equals(that.attr3) : that.attr3 != null) return false;
        if (attr4 != null ? !attr4.equals(that.attr4) : that.attr4 != null) return false;
        if (attr5 != null ? !attr5.equals(that.attr5) : that.attr5 != null) return false;
        if (attr6 != null ? !attr6.equals(that.attr6) : that.attr6 != null) return false;
        if (attr7 != null ? !attr7.equals(that.attr7) : that.attr7 != null) return false;
        if (attr8 != null ? !attr8.equals(that.attr8) : that.attr8 != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        result = 31 * result + (groupId != null ? groupId.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (crtTime != null ? crtTime.hashCode() : 0);
        result = 31 * result + (crtUser != null ? crtUser.hashCode() : 0);
        result = 31 * result + (crtName != null ? crtName.hashCode() : 0);
        result = 31 * result + (crtHost != null ? crtHost.hashCode() : 0);
        result = 31 * result + (updTime != null ? updTime.hashCode() : 0);
        result = 31 * result + (updUser != null ? updUser.hashCode() : 0);
        result = 31 * result + (updName != null ? updName.hashCode() : 0);
        result = 31 * result + (updHost != null ? updHost.hashCode() : 0);
        result = 31 * result + (attr1 != null ? attr1.hashCode() : 0);
        result = 31 * result + (attr2 != null ? attr2.hashCode() : 0);
        result = 31 * result + (attr3 != null ? attr3.hashCode() : 0);
        result = 31 * result + (attr4 != null ? attr4.hashCode() : 0);
        result = 31 * result + (attr5 != null ? attr5.hashCode() : 0);
        result = 31 * result + (attr6 != null ? attr6.hashCode() : 0);
        result = 31 * result + (attr7 != null ? attr7.hashCode() : 0);
        result = 31 * result + (attr8 != null ? attr8.hashCode() : 0);
        return result;
    }
}
