package org.example.syntheakds.processing.openehr.generated.kdsdiagnosecomposition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datavalues.DvCodedText;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Archetype("openEHR-EHR-CLUSTER.lebensphase.v0")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2022-11-02T11:31:18.558821700+01:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.23.0-SNAPSHOT"
)
public class LebensphaseCluster implements LocatableEntity {
  /**
   * Path: Diagnose/Primärcode/Lebensphase/Beginn
   * Description: Lebensphase, in der das Problem / eine Erkrankung zum ersten Mal aufgetreten ist / diagnostiziert wurde.
   */
  @Path("/items[at0001]/value")
  private DvCodedText beginn;

  /**
   * Path: Diagnose/Primärcode/Structure/Lebensphase/Beginn/null_flavour
   */
  @Path("/items[at0001]/null_flavour|defining_code")
  private NullFlavour beginnNullFlavourDefiningCode;

  /**
   * Path: Diagnose/Primärcode/Lebensphase/Ende
   * Description: Lebensphase, in der das Problem / eine Erkrankung zum letzen Mal aufgetreten ist / zuletzt diagnostiziert wurde.
   */
  @Path("/items[at0002]/value")
  private DvCodedText ende;

  /**
   * Path: Diagnose/Primärcode/Structure/Lebensphase/Ende/null_flavour
   */
  @Path("/items[at0002]/null_flavour|defining_code")
  private NullFlavour endeNullFlavourDefiningCode;

  /**
   * Path: Diagnose/Primärcode/Lebensphase/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setBeginn(DvCodedText beginn) {
     this.beginn = beginn;
  }

  public DvCodedText getBeginn() {
     return this.beginn ;
  }

  public void setBeginnNullFlavourDefiningCode(NullFlavour beginnNullFlavourDefiningCode) {
     this.beginnNullFlavourDefiningCode = beginnNullFlavourDefiningCode;
  }

  public NullFlavour getBeginnNullFlavourDefiningCode() {
     return this.beginnNullFlavourDefiningCode ;
  }

  public void setEnde(DvCodedText ende) {
     this.ende = ende;
  }

  public DvCodedText getEnde() {
     return this.ende ;
  }

  public void setEndeNullFlavourDefiningCode(NullFlavour endeNullFlavourDefiningCode) {
     this.endeNullFlavourDefiningCode = endeNullFlavourDefiningCode;
  }

  public NullFlavour getEndeNullFlavourDefiningCode() {
     return this.endeNullFlavourDefiningCode ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
