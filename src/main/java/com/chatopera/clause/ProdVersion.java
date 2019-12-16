/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.chatopera.clause;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
/**
 * 上线版本
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-12-16")
public class ProdVersion implements org.apache.thrift.TBase<ProdVersion, ProdVersion._Fields>, java.io.Serializable, Cloneable, Comparable<ProdVersion> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ProdVersion");

  private static final org.apache.thrift.protocol.TField CHATBOT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("chatbotID", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("version", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField ACTIVE_FIELD_DESC = new org.apache.thrift.protocol.TField("active", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField LATEST_FIELD_DESC = new org.apache.thrift.protocol.TField("latest", org.apache.thrift.protocol.TType.BOOL, (short)4);
  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField OPERATED_FIELD_DESC = new org.apache.thrift.protocol.TField("operated", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField NOTES_FIELD_DESC = new org.apache.thrift.protocol.TField("notes", org.apache.thrift.protocol.TType.STRING, (short)7);
  private static final org.apache.thrift.protocol.TField CREATEDATE_FIELD_DESC = new org.apache.thrift.protocol.TField("createdate", org.apache.thrift.protocol.TType.STRING, (short)8);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ProdVersionStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ProdVersionTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String chatbotID; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String version; // optional
  public boolean active; // optional
  public boolean latest; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String id; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String operated; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String notes; // optional
  public @org.apache.thrift.annotation.Nullable java.lang.String createdate; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CHATBOT_ID((short)1, "chatbotID"),
    VERSION((short)2, "version"),
    ACTIVE((short)3, "active"),
    LATEST((short)4, "latest"),
    ID((short)5, "id"),
    OPERATED((short)6, "operated"),
    NOTES((short)7, "notes"),
    CREATEDATE((short)8, "createdate");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // CHATBOT_ID
          return CHATBOT_ID;
        case 2: // VERSION
          return VERSION;
        case 3: // ACTIVE
          return ACTIVE;
        case 4: // LATEST
          return LATEST;
        case 5: // ID
          return ID;
        case 6: // OPERATED
          return OPERATED;
        case 7: // NOTES
          return NOTES;
        case 8: // CREATEDATE
          return CREATEDATE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ACTIVE_ISSET_ID = 0;
  private static final int __LATEST_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.CHATBOT_ID,_Fields.VERSION,_Fields.ACTIVE,_Fields.LATEST,_Fields.ID,_Fields.OPERATED,_Fields.NOTES,_Fields.CREATEDATE};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CHATBOT_ID, new org.apache.thrift.meta_data.FieldMetaData("chatbotID", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VERSION, new org.apache.thrift.meta_data.FieldMetaData("version", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ACTIVE, new org.apache.thrift.meta_data.FieldMetaData("active", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.LATEST, new org.apache.thrift.meta_data.FieldMetaData("latest", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.OPERATED, new org.apache.thrift.meta_data.FieldMetaData("operated", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NOTES, new org.apache.thrift.meta_data.FieldMetaData("notes", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CREATEDATE, new org.apache.thrift.meta_data.FieldMetaData("createdate", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "Timestamp")));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ProdVersion.class, metaDataMap);
  }

  public ProdVersion() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ProdVersion(ProdVersion other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetChatbotID()) {
      this.chatbotID = other.chatbotID;
    }
    if (other.isSetVersion()) {
      this.version = other.version;
    }
    this.active = other.active;
    this.latest = other.latest;
    if (other.isSetId()) {
      this.id = other.id;
    }
    if (other.isSetOperated()) {
      this.operated = other.operated;
    }
    if (other.isSetNotes()) {
      this.notes = other.notes;
    }
    if (other.isSetCreatedate()) {
      this.createdate = other.createdate;
    }
  }

  public ProdVersion deepCopy() {
    return new ProdVersion(this);
  }

  @Override
  public void clear() {
    this.chatbotID = null;
    this.version = null;
    setActiveIsSet(false);
    this.active = false;
    setLatestIsSet(false);
    this.latest = false;
    this.id = null;
    this.operated = null;
    this.notes = null;
    this.createdate = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getChatbotID() {
    return this.chatbotID;
  }

  public ProdVersion setChatbotID(@org.apache.thrift.annotation.Nullable java.lang.String chatbotID) {
    this.chatbotID = chatbotID;
    return this;
  }

  public void unsetChatbotID() {
    this.chatbotID = null;
  }

  /** Returns true if field chatbotID is set (has been assigned a value) and false otherwise */
  public boolean isSetChatbotID() {
    return this.chatbotID != null;
  }

  public void setChatbotIDIsSet(boolean value) {
    if (!value) {
      this.chatbotID = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getVersion() {
    return this.version;
  }

  public ProdVersion setVersion(@org.apache.thrift.annotation.Nullable java.lang.String version) {
    this.version = version;
    return this;
  }

  public void unsetVersion() {
    this.version = null;
  }

  /** Returns true if field version is set (has been assigned a value) and false otherwise */
  public boolean isSetVersion() {
    return this.version != null;
  }

  public void setVersionIsSet(boolean value) {
    if (!value) {
      this.version = null;
    }
  }

  public boolean isActive() {
    return this.active;
  }

  public ProdVersion setActive(boolean active) {
    this.active = active;
    setActiveIsSet(true);
    return this;
  }

  public void unsetActive() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ACTIVE_ISSET_ID);
  }

  /** Returns true if field active is set (has been assigned a value) and false otherwise */
  public boolean isSetActive() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ACTIVE_ISSET_ID);
  }

  public void setActiveIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ACTIVE_ISSET_ID, value);
  }

  public boolean isLatest() {
    return this.latest;
  }

  public ProdVersion setLatest(boolean latest) {
    this.latest = latest;
    setLatestIsSet(true);
    return this;
  }

  public void unsetLatest() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __LATEST_ISSET_ID);
  }

  /** Returns true if field latest is set (has been assigned a value) and false otherwise */
  public boolean isSetLatest() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __LATEST_ISSET_ID);
  }

  public void setLatestIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __LATEST_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getId() {
    return this.id;
  }

  public ProdVersion setId(@org.apache.thrift.annotation.Nullable java.lang.String id) {
    this.id = id;
    return this;
  }

  public void unsetId() {
    this.id = null;
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return this.id != null;
  }

  public void setIdIsSet(boolean value) {
    if (!value) {
      this.id = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getOperated() {
    return this.operated;
  }

  public ProdVersion setOperated(@org.apache.thrift.annotation.Nullable java.lang.String operated) {
    this.operated = operated;
    return this;
  }

  public void unsetOperated() {
    this.operated = null;
  }

  /** Returns true if field operated is set (has been assigned a value) and false otherwise */
  public boolean isSetOperated() {
    return this.operated != null;
  }

  public void setOperatedIsSet(boolean value) {
    if (!value) {
      this.operated = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getNotes() {
    return this.notes;
  }

  public ProdVersion setNotes(@org.apache.thrift.annotation.Nullable java.lang.String notes) {
    this.notes = notes;
    return this;
  }

  public void unsetNotes() {
    this.notes = null;
  }

  /** Returns true if field notes is set (has been assigned a value) and false otherwise */
  public boolean isSetNotes() {
    return this.notes != null;
  }

  public void setNotesIsSet(boolean value) {
    if (!value) {
      this.notes = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getCreatedate() {
    return this.createdate;
  }

  public ProdVersion setCreatedate(@org.apache.thrift.annotation.Nullable java.lang.String createdate) {
    this.createdate = createdate;
    return this;
  }

  public void unsetCreatedate() {
    this.createdate = null;
  }

  /** Returns true if field createdate is set (has been assigned a value) and false otherwise */
  public boolean isSetCreatedate() {
    return this.createdate != null;
  }

  public void setCreatedateIsSet(boolean value) {
    if (!value) {
      this.createdate = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case CHATBOT_ID:
      if (value == null) {
        unsetChatbotID();
      } else {
        setChatbotID((java.lang.String)value);
      }
      break;

    case VERSION:
      if (value == null) {
        unsetVersion();
      } else {
        setVersion((java.lang.String)value);
      }
      break;

    case ACTIVE:
      if (value == null) {
        unsetActive();
      } else {
        setActive((java.lang.Boolean)value);
      }
      break;

    case LATEST:
      if (value == null) {
        unsetLatest();
      } else {
        setLatest((java.lang.Boolean)value);
      }
      break;

    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((java.lang.String)value);
      }
      break;

    case OPERATED:
      if (value == null) {
        unsetOperated();
      } else {
        setOperated((java.lang.String)value);
      }
      break;

    case NOTES:
      if (value == null) {
        unsetNotes();
      } else {
        setNotes((java.lang.String)value);
      }
      break;

    case CREATEDATE:
      if (value == null) {
        unsetCreatedate();
      } else {
        setCreatedate((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CHATBOT_ID:
      return getChatbotID();

    case VERSION:
      return getVersion();

    case ACTIVE:
      return isActive();

    case LATEST:
      return isLatest();

    case ID:
      return getId();

    case OPERATED:
      return getOperated();

    case NOTES:
      return getNotes();

    case CREATEDATE:
      return getCreatedate();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case CHATBOT_ID:
      return isSetChatbotID();
    case VERSION:
      return isSetVersion();
    case ACTIVE:
      return isSetActive();
    case LATEST:
      return isSetLatest();
    case ID:
      return isSetId();
    case OPERATED:
      return isSetOperated();
    case NOTES:
      return isSetNotes();
    case CREATEDATE:
      return isSetCreatedate();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof ProdVersion)
      return this.equals((ProdVersion)that);
    return false;
  }

  public boolean equals(ProdVersion that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_chatbotID = true && this.isSetChatbotID();
    boolean that_present_chatbotID = true && that.isSetChatbotID();
    if (this_present_chatbotID || that_present_chatbotID) {
      if (!(this_present_chatbotID && that_present_chatbotID))
        return false;
      if (!this.chatbotID.equals(that.chatbotID))
        return false;
    }

    boolean this_present_version = true && this.isSetVersion();
    boolean that_present_version = true && that.isSetVersion();
    if (this_present_version || that_present_version) {
      if (!(this_present_version && that_present_version))
        return false;
      if (!this.version.equals(that.version))
        return false;
    }

    boolean this_present_active = true && this.isSetActive();
    boolean that_present_active = true && that.isSetActive();
    if (this_present_active || that_present_active) {
      if (!(this_present_active && that_present_active))
        return false;
      if (this.active != that.active)
        return false;
    }

    boolean this_present_latest = true && this.isSetLatest();
    boolean that_present_latest = true && that.isSetLatest();
    if (this_present_latest || that_present_latest) {
      if (!(this_present_latest && that_present_latest))
        return false;
      if (this.latest != that.latest)
        return false;
    }

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (!this.id.equals(that.id))
        return false;
    }

    boolean this_present_operated = true && this.isSetOperated();
    boolean that_present_operated = true && that.isSetOperated();
    if (this_present_operated || that_present_operated) {
      if (!(this_present_operated && that_present_operated))
        return false;
      if (!this.operated.equals(that.operated))
        return false;
    }

    boolean this_present_notes = true && this.isSetNotes();
    boolean that_present_notes = true && that.isSetNotes();
    if (this_present_notes || that_present_notes) {
      if (!(this_present_notes && that_present_notes))
        return false;
      if (!this.notes.equals(that.notes))
        return false;
    }

    boolean this_present_createdate = true && this.isSetCreatedate();
    boolean that_present_createdate = true && that.isSetCreatedate();
    if (this_present_createdate || that_present_createdate) {
      if (!(this_present_createdate && that_present_createdate))
        return false;
      if (!this.createdate.equals(that.createdate))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetChatbotID()) ? 131071 : 524287);
    if (isSetChatbotID())
      hashCode = hashCode * 8191 + chatbotID.hashCode();

    hashCode = hashCode * 8191 + ((isSetVersion()) ? 131071 : 524287);
    if (isSetVersion())
      hashCode = hashCode * 8191 + version.hashCode();

    hashCode = hashCode * 8191 + ((isSetActive()) ? 131071 : 524287);
    if (isSetActive())
      hashCode = hashCode * 8191 + ((active) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetLatest()) ? 131071 : 524287);
    if (isSetLatest())
      hashCode = hashCode * 8191 + ((latest) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetId()) ? 131071 : 524287);
    if (isSetId())
      hashCode = hashCode * 8191 + id.hashCode();

    hashCode = hashCode * 8191 + ((isSetOperated()) ? 131071 : 524287);
    if (isSetOperated())
      hashCode = hashCode * 8191 + operated.hashCode();

    hashCode = hashCode * 8191 + ((isSetNotes()) ? 131071 : 524287);
    if (isSetNotes())
      hashCode = hashCode * 8191 + notes.hashCode();

    hashCode = hashCode * 8191 + ((isSetCreatedate()) ? 131071 : 524287);
    if (isSetCreatedate())
      hashCode = hashCode * 8191 + createdate.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ProdVersion other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetChatbotID()).compareTo(other.isSetChatbotID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChatbotID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.chatbotID, other.chatbotID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetVersion()).compareTo(other.isSetVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.version, other.version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetActive()).compareTo(other.isSetActive());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetActive()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.active, other.active);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetLatest()).compareTo(other.isSetLatest());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLatest()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.latest, other.latest);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetOperated()).compareTo(other.isSetOperated());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOperated()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.operated, other.operated);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetNotes()).compareTo(other.isSetNotes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNotes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.notes, other.notes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCreatedate()).compareTo(other.isSetCreatedate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreatedate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.createdate, other.createdate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ProdVersion(");
    boolean first = true;

    if (isSetChatbotID()) {
      sb.append("chatbotID:");
      if (this.chatbotID == null) {
        sb.append("null");
      } else {
        sb.append(this.chatbotID);
      }
      first = false;
    }
    if (isSetVersion()) {
      if (!first) sb.append(", ");
      sb.append("version:");
      if (this.version == null) {
        sb.append("null");
      } else {
        sb.append(this.version);
      }
      first = false;
    }
    if (isSetActive()) {
      if (!first) sb.append(", ");
      sb.append("active:");
      sb.append(this.active);
      first = false;
    }
    if (isSetLatest()) {
      if (!first) sb.append(", ");
      sb.append("latest:");
      sb.append(this.latest);
      first = false;
    }
    if (isSetId()) {
      if (!first) sb.append(", ");
      sb.append("id:");
      if (this.id == null) {
        sb.append("null");
      } else {
        sb.append(this.id);
      }
      first = false;
    }
    if (isSetOperated()) {
      if (!first) sb.append(", ");
      sb.append("operated:");
      if (this.operated == null) {
        sb.append("null");
      } else {
        sb.append(this.operated);
      }
      first = false;
    }
    if (isSetNotes()) {
      if (!first) sb.append(", ");
      sb.append("notes:");
      if (this.notes == null) {
        sb.append("null");
      } else {
        sb.append(this.notes);
      }
      first = false;
    }
    if (isSetCreatedate()) {
      if (!first) sb.append(", ");
      sb.append("createdate:");
      if (this.createdate == null) {
        sb.append("null");
      } else {
        sb.append(this.createdate);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ProdVersionStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ProdVersionStandardScheme getScheme() {
      return new ProdVersionStandardScheme();
    }
  }

  private static class ProdVersionStandardScheme extends org.apache.thrift.scheme.StandardScheme<ProdVersion> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ProdVersion struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CHATBOT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.chatbotID = iprot.readString();
              struct.setChatbotIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.version = iprot.readString();
              struct.setVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ACTIVE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.active = iprot.readBool();
              struct.setActiveIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // LATEST
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.latest = iprot.readBool();
              struct.setLatestIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.id = iprot.readString();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // OPERATED
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.operated = iprot.readString();
              struct.setOperatedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // NOTES
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.notes = iprot.readString();
              struct.setNotesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // CREATEDATE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.createdate = iprot.readString();
              struct.setCreatedateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ProdVersion struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.chatbotID != null) {
        if (struct.isSetChatbotID()) {
          oprot.writeFieldBegin(CHATBOT_ID_FIELD_DESC);
          oprot.writeString(struct.chatbotID);
          oprot.writeFieldEnd();
        }
      }
      if (struct.version != null) {
        if (struct.isSetVersion()) {
          oprot.writeFieldBegin(VERSION_FIELD_DESC);
          oprot.writeString(struct.version);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetActive()) {
        oprot.writeFieldBegin(ACTIVE_FIELD_DESC);
        oprot.writeBool(struct.active);
        oprot.writeFieldEnd();
      }
      if (struct.isSetLatest()) {
        oprot.writeFieldBegin(LATEST_FIELD_DESC);
        oprot.writeBool(struct.latest);
        oprot.writeFieldEnd();
      }
      if (struct.id != null) {
        if (struct.isSetId()) {
          oprot.writeFieldBegin(ID_FIELD_DESC);
          oprot.writeString(struct.id);
          oprot.writeFieldEnd();
        }
      }
      if (struct.operated != null) {
        if (struct.isSetOperated()) {
          oprot.writeFieldBegin(OPERATED_FIELD_DESC);
          oprot.writeString(struct.operated);
          oprot.writeFieldEnd();
        }
      }
      if (struct.notes != null) {
        if (struct.isSetNotes()) {
          oprot.writeFieldBegin(NOTES_FIELD_DESC);
          oprot.writeString(struct.notes);
          oprot.writeFieldEnd();
        }
      }
      if (struct.createdate != null) {
        if (struct.isSetCreatedate()) {
          oprot.writeFieldBegin(CREATEDATE_FIELD_DESC);
          oprot.writeString(struct.createdate);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ProdVersionTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ProdVersionTupleScheme getScheme() {
      return new ProdVersionTupleScheme();
    }
  }

  private static class ProdVersionTupleScheme extends org.apache.thrift.scheme.TupleScheme<ProdVersion> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ProdVersion struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetChatbotID()) {
        optionals.set(0);
      }
      if (struct.isSetVersion()) {
        optionals.set(1);
      }
      if (struct.isSetActive()) {
        optionals.set(2);
      }
      if (struct.isSetLatest()) {
        optionals.set(3);
      }
      if (struct.isSetId()) {
        optionals.set(4);
      }
      if (struct.isSetOperated()) {
        optionals.set(5);
      }
      if (struct.isSetNotes()) {
        optionals.set(6);
      }
      if (struct.isSetCreatedate()) {
        optionals.set(7);
      }
      oprot.writeBitSet(optionals, 8);
      if (struct.isSetChatbotID()) {
        oprot.writeString(struct.chatbotID);
      }
      if (struct.isSetVersion()) {
        oprot.writeString(struct.version);
      }
      if (struct.isSetActive()) {
        oprot.writeBool(struct.active);
      }
      if (struct.isSetLatest()) {
        oprot.writeBool(struct.latest);
      }
      if (struct.isSetId()) {
        oprot.writeString(struct.id);
      }
      if (struct.isSetOperated()) {
        oprot.writeString(struct.operated);
      }
      if (struct.isSetNotes()) {
        oprot.writeString(struct.notes);
      }
      if (struct.isSetCreatedate()) {
        oprot.writeString(struct.createdate);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ProdVersion struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(8);
      if (incoming.get(0)) {
        struct.chatbotID = iprot.readString();
        struct.setChatbotIDIsSet(true);
      }
      if (incoming.get(1)) {
        struct.version = iprot.readString();
        struct.setVersionIsSet(true);
      }
      if (incoming.get(2)) {
        struct.active = iprot.readBool();
        struct.setActiveIsSet(true);
      }
      if (incoming.get(3)) {
        struct.latest = iprot.readBool();
        struct.setLatestIsSet(true);
      }
      if (incoming.get(4)) {
        struct.id = iprot.readString();
        struct.setIdIsSet(true);
      }
      if (incoming.get(5)) {
        struct.operated = iprot.readString();
        struct.setOperatedIsSet(true);
      }
      if (incoming.get(6)) {
        struct.notes = iprot.readString();
        struct.setNotesIsSet(true);
      }
      if (incoming.get(7)) {
        struct.createdate = iprot.readString();
        struct.setCreatedateIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

