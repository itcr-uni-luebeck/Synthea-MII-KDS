package org.example.syntheakds.processing.openehr.generated.kdslaborberichtcomposition.definition;

import com.nedap.archie.rm.datavalues.DvIdentifier;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2022-11-02T11:29:41.137540500+01:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 1.23.0-SNAPSHOT"
)
@OptionFor("DV_IDENTIFIER")
public class LaborbefundIdentifikationDerLaboranforderungDvIdentifier implements RMEntity, LaborbefundIdentifikationDerLaboranforderungChoice {
  /**
   * Path: Laborbericht/Laborbefund/Details der Testanforderung/Identifikation der Laboranforderung/Identifikation der Laboranforderung
   * Description: Lokale Auftrags-ID, die vom auftragsempfangendem System, gewöhnlich dem Laborinformationssystem (LIS) zugewiesen wird.
   * Comment: Die Vergabe einer solchen ID ermöglicht das Nachverfolgen des Auftragsstatus und das Verlinken der Ergebnisse zum Auftrag. Es erlaubt auch das Verwalten von weiteren Erkundigungen und Nachfragen und ist äquivalent zum "HL7 Filler Order Identifier".
   */
  @Path("")
  private DvIdentifier identifikationDerLaboranforderung;

  public void setIdentifikationDerLaboranforderung(DvIdentifier identifikationDerLaboranforderung) {
     this.identifikationDerLaboranforderung = identifikationDerLaboranforderung;
  }

  public DvIdentifier getIdentifikationDerLaboranforderung() {
     return this.identifikationDerLaboranforderung ;
  }
}
