/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package influent.idl;  
@SuppressWarnings("all")
/** Cluster of nodes in the social, financial, communications or other graphs. */
@org.apache.avro.specific.AvroGenerated
public class FL_Cluster extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"FL_Cluster\",\"namespace\":\"influent.idl\",\"doc\":\"Cluster of nodes in the social, financial, communications or other graphs.\",\"fields\":[{\"name\":\"uid\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"A unique identifier use to retrieve data about this cluster. Should not be used for non-global identifiers.\"},{\"name\":\"tags\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"enum\",\"name\":\"FL_EntityTag\",\"doc\":\"This is the current list of tags for Entities:\",\"symbols\":[\"ACCOUNT\",\"GROUP\",\"CLUSTER\",\"FILE\",\"ANONYMOUS\",\"OTHER\"]}},\"doc\":\"Entity Tags (see DataTypes, e.g. \\\"CLUSTER\\\")\"},{\"name\":\"provenance\",\"type\":[{\"type\":\"record\",\"name\":\"FL_Provenance\",\"doc\":\"This is a placeholder for future modeling of provenance. It is not a required field in any service calls.\",\"fields\":[{\"name\":\"uri\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Placeholder for now. Express provenance as a single URI.\"}]},\"null\"],\"default\":null},{\"name\":\"uncertainty\",\"type\":[{\"type\":\"record\",\"name\":\"FL_Uncertainty\",\"doc\":\"This is a placeholder for future modeling of uncertainty. It is not a required field in any service calls.\",\"fields\":[{\"name\":\"confidence\",\"type\":\"double\",\"doc\":\"Placeholder for now. Express uncertainty as a single number from 0 to 1.\",\"default\":1}]},\"null\"],\"default\":null},{\"name\":\"properties\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"FL_Property\",\"doc\":\"Each property on an Entity or Link is a name-value pair, with data type information, as well as optional\\r\\n\\t provenance. Tags provide a way for the data provider to associate semantic annotations to each property\\r\\n\\t in terms of the semantics of the application.\",\"fields\":[{\"name\":\"key\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"the field name in the underlying data source\"},{\"name\":\"friendlyText\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"user-friendly short-text for key (displayable)\",\"default\":null},{\"name\":\"value\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"float\",\"double\",\"long\",\"boolean\",{\"type\":\"record\",\"name\":\"FL_GeoData\",\"doc\":\"Structured representation of geo-spatial data.\",\"fields\":[{\"name\":\"text\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"an address or other place reference; unstructured text field\",\"default\":null},{\"name\":\"lat\",\"type\":[\"double\",\"null\"],\"doc\":\"latitude\",\"default\":null},{\"name\":\"lon\",\"type\":[\"double\",\"null\"],\"doc\":\"longitude\",\"default\":null},{\"name\":\"cc\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"ISO 3 digit country code\",\"default\":null}]},{\"type\":\"record\",\"name\":\"FL_Series\",\"doc\":\"This is a placeholder for timeseries and other series that are available as property values, which the UI will use to make\\r\\n\\t charts. This may come back from aggregating links.\",\"fields\":[]},\"null\"],\"default\":null},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"FL_PropertyType\",\"doc\":\"Allowed types for Property values.\",\"symbols\":[\"DOUBLE\",\"LONG\",\"BOOLEAN\",\"STRING\",\"DATE\",\"GEO\",\"SERIES\",\"OTHER\"]},\"doc\":\"One of DOUBLE, LONG, BOOLEAN, STRING, DATE, GEO, SERIES, OTHER\"},{\"name\":\"provenance\",\"type\":[\"FL_Provenance\",\"null\"],\"default\":null},{\"name\":\"uncertainty\",\"type\":[\"FL_Uncertainty\",\"null\"],\"default\":null},{\"name\":\"tags\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"enum\",\"name\":\"FL_PropertyTag\",\"doc\":\"Tags are defined by the application layer as a taxonomy of user and application concepts,\\r\\n\\t independent of the data sources. This allows application semantics to be re-used with new\\r\\n\\t data, with a minimum of new software design and development. Data layer entity types, link\\r\\n\\t types and properties should be mapped into the list of tags. The application layer must be\\r\\n\\t able to search by native field name or by tag interchangeably, and properties returned must\\r\\n\\t contain both native field names as well as tags.\\r\\n\\t \\r\\n\\t The list of tags may change as application features evolve, though that will require\\r\\n\\t collaboration with the data layer providers. Evolving the tag list should not change the\\r\\n\\t Data Access or Search APIs.\\r\\n\\r\\n\\t This is the current list of tags for Properties:\",\"symbols\":[\"ID\",\"TYPE\",\"LABEL\",\"STAT\",\"TEXT\",\"LINKED_DATA\",\"IMAGE\",\"GEO\",\"DATE\",\"AMOUNT\",\"CREDIT\",\"DEBIT\",\"COUNT\",\"SERIES\",\"CONSTRUCTED\",\"RAW\"]}},\"doc\":\"one or more tags from the Tag list, used to map this source-specific field into the semantics of applications\"}]}}},{\"name\":\"members\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"doc\":\"List of id's of the members of this cluster - can be either entity id's or cluster id's if this is a cluster in a hierarchy\"},{\"name\":\"parent\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"The id of the parent cluster if this is a cluster in a hierarchy - Can be null if this is a root cluster *\",\"default\":null},{\"name\":\"root\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"The id of the root cluster (top level cluster) if this is a cluster in a hierarchy - Can be null if this is a root cluster *\",\"default\":null},{\"name\":\"level\",\"type\":\"int\",\"doc\":\"The degree from the root this cluster is in the hierarchy - level = 0 if this is a root cluster *\",\"default\":0}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** A unique identifier use to retrieve data about this cluster. Should not be used for non-global identifiers. */
   private java.lang.String uid;
  /** Entity Tags (see DataTypes, e.g. "CLUSTER") */
   private java.util.List<influent.idl.FL_EntityTag> tags;
   private influent.idl.FL_Provenance provenance;
   private influent.idl.FL_Uncertainty uncertainty;
   private java.util.List<influent.idl.FL_Property> properties;
  /** List of id's of the members of this cluster - can be either entity id's or cluster id's if this is a cluster in a hierarchy */
   private java.util.List<java.lang.String> members;
  /** The id of the parent cluster if this is a cluster in a hierarchy - Can be null if this is a root cluster * */
   private java.lang.String parent;
  /** The id of the root cluster (top level cluster) if this is a cluster in a hierarchy - Can be null if this is a root cluster * */
   private java.lang.String root;
  /** The degree from the root this cluster is in the hierarchy - level = 0 if this is a root cluster * */
   private int level;

  /**
   * Default constructor.
   */
  public FL_Cluster() {}

  /**
   * All-args constructor.
   */
  public FL_Cluster(java.lang.String uid, java.util.List<influent.idl.FL_EntityTag> tags, influent.idl.FL_Provenance provenance, influent.idl.FL_Uncertainty uncertainty, java.util.List<influent.idl.FL_Property> properties, java.util.List<java.lang.String> members, java.lang.String parent, java.lang.String root, java.lang.Integer level) {
    this.uid = uid;
    this.tags = tags;
    this.provenance = provenance;
    this.uncertainty = uncertainty;
    this.properties = properties;
    this.members = members;
    this.parent = parent;
    this.root = root;
    this.level = level;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return uid;
    case 1: return tags;
    case 2: return provenance;
    case 3: return uncertainty;
    case 4: return properties;
    case 5: return members;
    case 6: return parent;
    case 7: return root;
    case 8: return level;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: uid = (java.lang.String)value$; break;
    case 1: tags = (java.util.List<influent.idl.FL_EntityTag>)value$; break;
    case 2: provenance = (influent.idl.FL_Provenance)value$; break;
    case 3: uncertainty = (influent.idl.FL_Uncertainty)value$; break;
    case 4: properties = (java.util.List<influent.idl.FL_Property>)value$; break;
    case 5: members = (java.util.List<java.lang.String>)value$; break;
    case 6: parent = (java.lang.String)value$; break;
    case 7: root = (java.lang.String)value$; break;
    case 8: level = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'uid' field.
   * A unique identifier use to retrieve data about this cluster. Should not be used for non-global identifiers.   */
  public java.lang.String getUid() {
    return uid;
  }

  /**
   * Sets the value of the 'uid' field.
   * A unique identifier use to retrieve data about this cluster. Should not be used for non-global identifiers.   * @param value the value to set.
   */
  public void setUid(java.lang.String value) {
    this.uid = value;
  }

  /**
   * Gets the value of the 'tags' field.
   * Entity Tags (see DataTypes, e.g. "CLUSTER")   */
  public java.util.List<influent.idl.FL_EntityTag> getTags() {
    return tags;
  }

  /**
   * Sets the value of the 'tags' field.
   * Entity Tags (see DataTypes, e.g. "CLUSTER")   * @param value the value to set.
   */
  public void setTags(java.util.List<influent.idl.FL_EntityTag> value) {
    this.tags = value;
  }

  /**
   * Gets the value of the 'provenance' field.
   */
  public influent.idl.FL_Provenance getProvenance() {
    return provenance;
  }

  /**
   * Sets the value of the 'provenance' field.
   * @param value the value to set.
   */
  public void setProvenance(influent.idl.FL_Provenance value) {
    this.provenance = value;
  }

  /**
   * Gets the value of the 'uncertainty' field.
   */
  public influent.idl.FL_Uncertainty getUncertainty() {
    return uncertainty;
  }

  /**
   * Sets the value of the 'uncertainty' field.
   * @param value the value to set.
   */
  public void setUncertainty(influent.idl.FL_Uncertainty value) {
    this.uncertainty = value;
  }

  /**
   * Gets the value of the 'properties' field.
   */
  public java.util.List<influent.idl.FL_Property> getProperties() {
    return properties;
  }

  /**
   * Sets the value of the 'properties' field.
   * @param value the value to set.
   */
  public void setProperties(java.util.List<influent.idl.FL_Property> value) {
    this.properties = value;
  }

  /**
   * Gets the value of the 'members' field.
   * List of id's of the members of this cluster - can be either entity id's or cluster id's if this is a cluster in a hierarchy   */
  public java.util.List<java.lang.String> getMembers() {
    return members;
  }

  /**
   * Sets the value of the 'members' field.
   * List of id's of the members of this cluster - can be either entity id's or cluster id's if this is a cluster in a hierarchy   * @param value the value to set.
   */
  public void setMembers(java.util.List<java.lang.String> value) {
    this.members = value;
  }

  /**
   * Gets the value of the 'parent' field.
   * The id of the parent cluster if this is a cluster in a hierarchy - Can be null if this is a root cluster *   */
  public java.lang.String getParent() {
    return parent;
  }

  /**
   * Sets the value of the 'parent' field.
   * The id of the parent cluster if this is a cluster in a hierarchy - Can be null if this is a root cluster *   * @param value the value to set.
   */
  public void setParent(java.lang.String value) {
    this.parent = value;
  }

  /**
   * Gets the value of the 'root' field.
   * The id of the root cluster (top level cluster) if this is a cluster in a hierarchy - Can be null if this is a root cluster *   */
  public java.lang.String getRoot() {
    return root;
  }

  /**
   * Sets the value of the 'root' field.
   * The id of the root cluster (top level cluster) if this is a cluster in a hierarchy - Can be null if this is a root cluster *   * @param value the value to set.
   */
  public void setRoot(java.lang.String value) {
    this.root = value;
  }

  /**
   * Gets the value of the 'level' field.
   * The degree from the root this cluster is in the hierarchy - level = 0 if this is a root cluster *   */
  public java.lang.Integer getLevel() {
    return level;
  }

  /**
   * Sets the value of the 'level' field.
   * The degree from the root this cluster is in the hierarchy - level = 0 if this is a root cluster *   * @param value the value to set.
   */
  public void setLevel(java.lang.Integer value) {
    this.level = value;
  }

  /** Creates a new FL_Cluster RecordBuilder */
  public static influent.idl.FL_Cluster.Builder newBuilder() {
    return new influent.idl.FL_Cluster.Builder();
  }
  
  /** Creates a new FL_Cluster RecordBuilder by copying an existing Builder */
  public static influent.idl.FL_Cluster.Builder newBuilder(influent.idl.FL_Cluster.Builder other) {
    return new influent.idl.FL_Cluster.Builder(other);
  }
  
  /** Creates a new FL_Cluster RecordBuilder by copying an existing FL_Cluster instance */
  public static influent.idl.FL_Cluster.Builder newBuilder(influent.idl.FL_Cluster other) {
    return new influent.idl.FL_Cluster.Builder(other);
  }
  
  /**
   * RecordBuilder for FL_Cluster instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<FL_Cluster>
    implements org.apache.avro.data.RecordBuilder<FL_Cluster> {

    private java.lang.String uid;
    private java.util.List<influent.idl.FL_EntityTag> tags;
    private influent.idl.FL_Provenance provenance;
    private influent.idl.FL_Uncertainty uncertainty;
    private java.util.List<influent.idl.FL_Property> properties;
    private java.util.List<java.lang.String> members;
    private java.lang.String parent;
    private java.lang.String root;
    private int level;

    /** Creates a new Builder */
    private Builder() {
      super(influent.idl.FL_Cluster.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(influent.idl.FL_Cluster.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing FL_Cluster instance */
    private Builder(influent.idl.FL_Cluster other) {
            super(influent.idl.FL_Cluster.SCHEMA$);
      if (isValidValue(fields()[0], other.uid)) {
        this.uid = data().deepCopy(fields()[0].schema(), other.uid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.tags)) {
        this.tags = data().deepCopy(fields()[1].schema(), other.tags);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.provenance)) {
        this.provenance = data().deepCopy(fields()[2].schema(), other.provenance);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.uncertainty)) {
        this.uncertainty = data().deepCopy(fields()[3].schema(), other.uncertainty);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.properties)) {
        this.properties = data().deepCopy(fields()[4].schema(), other.properties);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.members)) {
        this.members = data().deepCopy(fields()[5].schema(), other.members);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.parent)) {
        this.parent = data().deepCopy(fields()[6].schema(), other.parent);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.root)) {
        this.root = data().deepCopy(fields()[7].schema(), other.root);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.level)) {
        this.level = data().deepCopy(fields()[8].schema(), other.level);
        fieldSetFlags()[8] = true;
      }
    }

    /** Gets the value of the 'uid' field */
    public java.lang.String getUid() {
      return uid;
    }
    
    /** Sets the value of the 'uid' field */
    public influent.idl.FL_Cluster.Builder setUid(java.lang.String value) {
      validate(fields()[0], value);
      this.uid = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'uid' field has been set */
    public boolean hasUid() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'uid' field */
    public influent.idl.FL_Cluster.Builder clearUid() {
      uid = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'tags' field */
    public java.util.List<influent.idl.FL_EntityTag> getTags() {
      return tags;
    }
    
    /** Sets the value of the 'tags' field */
    public influent.idl.FL_Cluster.Builder setTags(java.util.List<influent.idl.FL_EntityTag> value) {
      validate(fields()[1], value);
      this.tags = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'tags' field has been set */
    public boolean hasTags() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'tags' field */
    public influent.idl.FL_Cluster.Builder clearTags() {
      tags = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'provenance' field */
    public influent.idl.FL_Provenance getProvenance() {
      return provenance;
    }
    
    /** Sets the value of the 'provenance' field */
    public influent.idl.FL_Cluster.Builder setProvenance(influent.idl.FL_Provenance value) {
      validate(fields()[2], value);
      this.provenance = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'provenance' field has been set */
    public boolean hasProvenance() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'provenance' field */
    public influent.idl.FL_Cluster.Builder clearProvenance() {
      provenance = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'uncertainty' field */
    public influent.idl.FL_Uncertainty getUncertainty() {
      return uncertainty;
    }
    
    /** Sets the value of the 'uncertainty' field */
    public influent.idl.FL_Cluster.Builder setUncertainty(influent.idl.FL_Uncertainty value) {
      validate(fields()[3], value);
      this.uncertainty = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'uncertainty' field has been set */
    public boolean hasUncertainty() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'uncertainty' field */
    public influent.idl.FL_Cluster.Builder clearUncertainty() {
      uncertainty = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'properties' field */
    public java.util.List<influent.idl.FL_Property> getProperties() {
      return properties;
    }
    
    /** Sets the value of the 'properties' field */
    public influent.idl.FL_Cluster.Builder setProperties(java.util.List<influent.idl.FL_Property> value) {
      validate(fields()[4], value);
      this.properties = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'properties' field has been set */
    public boolean hasProperties() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'properties' field */
    public influent.idl.FL_Cluster.Builder clearProperties() {
      properties = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'members' field */
    public java.util.List<java.lang.String> getMembers() {
      return members;
    }
    
    /** Sets the value of the 'members' field */
    public influent.idl.FL_Cluster.Builder setMembers(java.util.List<java.lang.String> value) {
      validate(fields()[5], value);
      this.members = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'members' field has been set */
    public boolean hasMembers() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'members' field */
    public influent.idl.FL_Cluster.Builder clearMembers() {
      members = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'parent' field */
    public java.lang.String getParent() {
      return parent;
    }
    
    /** Sets the value of the 'parent' field */
    public influent.idl.FL_Cluster.Builder setParent(java.lang.String value) {
      validate(fields()[6], value);
      this.parent = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'parent' field has been set */
    public boolean hasParent() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'parent' field */
    public influent.idl.FL_Cluster.Builder clearParent() {
      parent = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'root' field */
    public java.lang.String getRoot() {
      return root;
    }
    
    /** Sets the value of the 'root' field */
    public influent.idl.FL_Cluster.Builder setRoot(java.lang.String value) {
      validate(fields()[7], value);
      this.root = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'root' field has been set */
    public boolean hasRoot() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'root' field */
    public influent.idl.FL_Cluster.Builder clearRoot() {
      root = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'level' field */
    public java.lang.Integer getLevel() {
      return level;
    }
    
    /** Sets the value of the 'level' field */
    public influent.idl.FL_Cluster.Builder setLevel(int value) {
      validate(fields()[8], value);
      this.level = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'level' field has been set */
    public boolean hasLevel() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'level' field */
    public influent.idl.FL_Cluster.Builder clearLevel() {
      fieldSetFlags()[8] = false;
      return this;
    }

    public FL_Cluster build() {
      try {
        FL_Cluster record = new FL_Cluster();
        record.uid = fieldSetFlags()[0] ? this.uid : (java.lang.String) defaultValue(fields()[0]);
        record.tags = fieldSetFlags()[1] ? this.tags : (java.util.List<influent.idl.FL_EntityTag>) defaultValue(fields()[1]);
        record.provenance = fieldSetFlags()[2] ? this.provenance : (influent.idl.FL_Provenance) defaultValue(fields()[2]);
        record.uncertainty = fieldSetFlags()[3] ? this.uncertainty : (influent.idl.FL_Uncertainty) defaultValue(fields()[3]);
        record.properties = fieldSetFlags()[4] ? this.properties : (java.util.List<influent.idl.FL_Property>) defaultValue(fields()[4]);
        record.members = fieldSetFlags()[5] ? this.members : (java.util.List<java.lang.String>) defaultValue(fields()[5]);
        record.parent = fieldSetFlags()[6] ? this.parent : (java.lang.String) defaultValue(fields()[6]);
        record.root = fieldSetFlags()[7] ? this.root : (java.lang.String) defaultValue(fields()[7]);
        record.level = fieldSetFlags()[8] ? this.level : (java.lang.Integer) defaultValue(fields()[8]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}