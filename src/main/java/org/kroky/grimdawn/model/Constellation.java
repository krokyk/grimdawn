package org.kroky.grimdawn.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "constellations")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Constellation {

    @Id
    private String name;
    @Column
    private Integer adcth;
    @Column
    private Integer armor;
    @Column
    private Integer armorAbsorb;
    @Column
    private Integer armorPct;
    @Column
    private Integer armorPiercing;
    @Column
    private Integer attackSpeed;
    @Column
    private Integer attrConstitution;
    @Column
    private Integer attrCunning;
    @Column
    private Integer attrCunningPct;
    @Column
    private Integer attrDa;
    @Column
    private Integer attrDaPct;
    @Column
    private Integer attrOa;
    @Column
    private Integer attrOaPct;
    @Column
    private Integer attrPhysique;
    @Column
    private Integer attrPhysiquePct;
    @Column
    private Integer attrSpirit;
    @Column
    private Integer attrSpiritPct;
    @Column
    private Integer avoidMelee;
    @Column
    private Integer avoidProjectiles;
    @Column
    private Integer castingSpeed;
    @Column
    private Integer dmgAcid;
    @Column
    private Integer dmgAcidPct;
    @Column
    private Integer dmgAether;
    @Column
    private Integer dmgAetherPct;
    @Column
    private Integer dmgAll;
    @Column
    private Integer dmgBleeding;
    @Column
    private Integer dmgBleedingPct;
    @Column
    private Integer dmgBurn;
    @Column
    private Integer dmgBurnPct;
    @Column
    private Integer dmgCold;
    @Column
    private Integer dmgColdPct;
    @Column
    private Integer dmgCrit;
    @Column
    private Integer dmgElectrocutePct;
    @Column
    private Integer dmgElemental;
    @Column
    private Integer dmgElementalPct;
    @Column
    private Integer dmgFire;
    @Column
    private Integer dmgFirePct;
    @Column
    private Integer dmgFrostburn;
    @Column
    private Integer dmgFrostburnPct;
    @Column
    private Integer dmgChaos;
    @Column
    private Integer dmgChaosPct;
    @Column
    private Integer dmgInternal;
    @Column
    private Integer dmgInternalPct;
    @Column
    private Integer dmgLightning;
    @Column
    private Integer dmgLightningPct;
    @Column
    private Integer dmgPhysical;
    @Column
    private Integer dmgPhysicalPct;
    @Column
    private Integer dmgPierce;
    @Column
    private Integer dmgPiercePct;
    @Column
    private Integer dmgPoison;
    @Column
    private Integer dmgPoisonPct;
    @Column
    private Integer dmgReflected;
    @Column
    private Integer dmgVitality;
    @Column
    private Integer dmgVitalityPct;
    @Column
    private Integer dotVitalityDecay;
    @Column
    private Integer dotVitalityDecayPct;
    @Column
    private Integer energy;
    @Column
    private Integer energyAbsorbed;
    @Column
    private Integer energyPct;
    @Column
    private Integer energyRegenPct;
    @Column
    private Integer energyRegenSec;
    @Column
    private Integer health;
    @Column
    private Integer healthPct;
    @Column
    private Integer healthRegenPct;
    @Column
    private Integer healthRegenSec;
    @Column
    private Integer lessDmgArachnids;
    @Column
    private Integer lessDmgBeasts;
    @Column
    private Integer lessDmgInsectoids;
    @Column
    private Integer lessDmgUndead;
    @Column
    private Integer movement;
    @Column
    private Integer petAdcth;
    @Column
    private Integer petAllDmg;
    @Column
    private Integer petArmorPct;
    @Column
    private Integer petAttackSpeed;
    @Column
    private Integer petDaPct;
    @Column
    private Integer petDmgBleeding;
    @Column
    private Integer petDmgCrit;
    @Column
    private Integer petDmgElemental;
    @Column
    private Integer petDmgFire;
    @Column
    private Integer petDmgLightning;
    @Column
    private Integer petDmgLightningPct;
    @Column
    private Integer petDmgPoison;
    @Column
    private Integer petHealthPct;
    @Column
    private Integer petHealthRegenPct;
    @Column
    private Integer petHealthRegenSec;
    @Column
    private Integer petOaPct;
    @Column
    private Integer petResAether;
    @Column
    private Integer petResAllMax;
    @Column
    private Integer petResBleeding;
    @Column
    private Integer petResElemental;
    @Column
    private Integer petResChaos;
    @Column
    private Integer petResPhysical;
    @Column
    private Integer petResPierce;
    @Column
    private Integer petResPoisonAcid;
    @Column
    private Integer petResVitality;
    @Column
    private Integer petRetAllDmg;
    @Column
    private Integer petRetPierce;
    @Column
    private Integer petTotalSpeed;
    @Column
    private Integer redBleedingDur;
    @Column
    private Integer redBurnDur;
    @Column
    private Integer redElectrocuteDur;
    @Column
    private Integer redElementalRes;
    @Column
    private Integer redEntrapmentDur;
    @Column
    private Integer redFreezeDur;
    @Column
    private Integer redFrostburnDur;
    @Column
    private Integer redInternalDur;
    @Column
    private Integer redLifeLeechDur;
    @Column
    private Integer redPoisonDur;
    @Column
    private Integer redReflectedDmg;
    @Column
    private Integer redStunDur;
    @Column
    private Integer redVitalityDecayDur;
    @Column
    private Integer reqCunningMelee;
    @Column
    private Integer reqCunningRanged;
    @Column
    private Integer reqPhysiqueMelee;
    @Column
    private Integer reqPhysiqueShield;
    @Column
    private Integer reqSpiritJewelry;
    @Column
    private Integer reqSpiritWeapon;
    @Column
    private Integer resAether;
    @Column
    private Integer resAetherMax;
    @Column
    private Integer resBleeding;
    @Column
    private Integer resBleedingMax;
    @Column
    private Integer resCold;
    @Column
    private Integer resColdMax;
    @Column
    private Integer resElemental;
    @Column
    private Integer resEnergyLeech;
    @Column
    private Integer resFire;
    @Column
    private Integer resChaos;
    @Column
    private Integer resChaosMax;
    @Column
    private Integer resLifeLeech;
    @Column
    private Integer resLightning;
    @Column
    private Integer resLightningMax;
    @Column
    private Integer resPhysical;
    @Column
    private Integer resPierce;
    @Column
    private Integer resPierceMax;
    @Column
    private Integer resPoisonAcid;
    @Column
    private Integer resPoisonAcidMax;
    @Column
    private Integer resSlow;
    @Column
    private Integer resVitality;
    @Column
    private Integer resVitalityMax;
    @Column
    private Integer retAllDmg;
    @Column
    private Integer retFire;
    @Column
    private Integer retChaos;
    @Column
    private Integer retPhysical;
    @Column
    private Integer retPierce;
    @Column
    private Integer retReducedAttackSpeed;
    @Column
    private Integer retSlowedMovement;
    @Column
    private Integer retVitalityDecay;
    @Column
    private Integer shieldBlockChance;
    @Column
    private Integer shieldDmgBlocked;
    @Column
    private Integer shieldRecovery;
    @Column
    private Integer skillDisruptProtect;
    @Column
    private Integer skillEnergyCostPct;
    @Column
    private Integer stunDuration;
    @Column
    private Integer stunChance;
    @Column
    private Integer totalSpeed;
    @Column
    private Integer vsBeastsDmgPct;
    @Column
    private Integer vsHumansDmgPct;
    @Column
    private Integer vsChthonicsDmgPct;
    @Column
    private Integer vsUndeadDmgPct;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAdcth() {
        return adcth;
    }

    public void setAdcth(Integer adcth) {
        this.adcth = adcth;
    }

    public Integer getArmor() {
        return armor;
    }

    public void setArmor(Integer armor) {
        this.armor = armor;
    }

    public Integer getArmorAbsorb() {
        return armorAbsorb;
    }

    public void setArmorAbsorb(Integer armorAbsorb) {
        this.armorAbsorb = armorAbsorb;
    }

    public Integer getArmorPct() {
        return armorPct;
    }

    public void setArmorPct(Integer armorPct) {
        this.armorPct = armorPct;
    }

    public Integer getArmorPiercing() {
        return armorPiercing;
    }

    public void setArmorPiercing(Integer armorPiercing) {
        this.armorPiercing = armorPiercing;
    }

    public Integer getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(Integer attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public Integer getAttrConstitution() {
        return attrConstitution;
    }

    public void setAttrConstitution(Integer attrConstitution) {
        this.attrConstitution = attrConstitution;
    }

    public Integer getAttrCunning() {
        return attrCunning;
    }

    public void setAttrCunning(Integer attrCunning) {
        this.attrCunning = attrCunning;
    }

    public Integer getAttrCunningPct() {
        return attrCunningPct;
    }

    public void setAttrCunningPct(Integer attrCunningPct) {
        this.attrCunningPct = attrCunningPct;
    }

    public Integer getAttrDa() {
        return attrDa;
    }

    public void setAttrDa(Integer attrDa) {
        this.attrDa = attrDa;
    }

    public Integer getAttrDaPct() {
        return attrDaPct;
    }

    public void setAttrDaPct(Integer attrDaPct) {
        this.attrDaPct = attrDaPct;
    }

    public Integer getAttrOa() {
        return attrOa;
    }

    public void setAttrOa(Integer attrOa) {
        this.attrOa = attrOa;
    }

    public Integer getAttrOaPct() {
        return attrOaPct;
    }

    public void setAttrOaPct(Integer attrOaPct) {
        this.attrOaPct = attrOaPct;
    }

    public Integer getAttrPhysique() {
        return attrPhysique;
    }

    public void setAttrPhysique(Integer attrPhysique) {
        this.attrPhysique = attrPhysique;
    }

    public Integer getAttrPhysiquePct() {
        return attrPhysiquePct;
    }

    public void setAttrPhysiquePct(Integer attrPhysiquePct) {
        this.attrPhysiquePct = attrPhysiquePct;
    }

    public Integer getAttrSpirit() {
        return attrSpirit;
    }

    public void setAttrSpirit(Integer attrSpirit) {
        this.attrSpirit = attrSpirit;
    }

    public Integer getAttrSpiritPct() {
        return attrSpiritPct;
    }

    public void setAttrSpiritPct(Integer attrSpiritPct) {
        this.attrSpiritPct = attrSpiritPct;
    }

    public Integer getAvoidMelee() {
        return avoidMelee;
    }

    public void setAvoidMelee(Integer avoidMelee) {
        this.avoidMelee = avoidMelee;
    }

    public Integer getAvoidProjectiles() {
        return avoidProjectiles;
    }

    public void setAvoidProjectiles(Integer avoidProjectiles) {
        this.avoidProjectiles = avoidProjectiles;
    }

    public Integer getCastingSpeed() {
        return castingSpeed;
    }

    public void setCastingSpeed(Integer castingSpeed) {
        this.castingSpeed = castingSpeed;
    }

    public Integer getDmgAcid() {
        return dmgAcid;
    }

    public void setDmgAcid(Integer dmgAcid) {
        this.dmgAcid = dmgAcid;
    }

    public Integer getDmgAcidPct() {
        return dmgAcidPct;
    }

    public void setDmgAcidPct(Integer dmgAcidPct) {
        this.dmgAcidPct = dmgAcidPct;
    }

    public Integer getDmgAether() {
        return dmgAether;
    }

    public void setDmgAether(Integer dmgAether) {
        this.dmgAether = dmgAether;
    }

    public Integer getDmgAetherPct() {
        return dmgAetherPct;
    }

    public void setDmgAetherPct(Integer dmgAetherPct) {
        this.dmgAetherPct = dmgAetherPct;
    }

    public Integer getDmgAll() {
        return dmgAll;
    }

    public void setDmgAll(Integer dmgAll) {
        this.dmgAll = dmgAll;
    }

    public Integer getDmgBleeding() {
        return dmgBleeding;
    }

    public void setDmgBleeding(Integer dmgBleeding) {
        this.dmgBleeding = dmgBleeding;
    }

    public Integer getDmgBleedingPct() {
        return dmgBleedingPct;
    }

    public void setDmgBleedingPct(Integer dmgBleedingPct) {
        this.dmgBleedingPct = dmgBleedingPct;
    }

    public Integer getDmgBurn() {
        return dmgBurn;
    }

    public void setDmgBurn(Integer dmgBurn) {
        this.dmgBurn = dmgBurn;
    }

    public Integer getDmgBurnPct() {
        return dmgBurnPct;
    }

    public void setDmgBurnPct(Integer dmgBurnPct) {
        this.dmgBurnPct = dmgBurnPct;
    }

    public Integer getDmgCold() {
        return dmgCold;
    }

    public void setDmgCold(Integer dmgCold) {
        this.dmgCold = dmgCold;
    }

    public Integer getDmgColdPct() {
        return dmgColdPct;
    }

    public void setDmgColdPct(Integer dmgColdPct) {
        this.dmgColdPct = dmgColdPct;
    }

    public Integer getDmgCrit() {
        return dmgCrit;
    }

    public void setDmgCrit(Integer dmgCrit) {
        this.dmgCrit = dmgCrit;
    }

    public Integer getDmgElectrocutePct() {
        return dmgElectrocutePct;
    }

    public void setDmgElectrocutePct(Integer dmgElectrocutePct) {
        this.dmgElectrocutePct = dmgElectrocutePct;
    }

    public Integer getDmgElemental() {
        return dmgElemental;
    }

    public void setDmgElemental(Integer dmgElemental) {
        this.dmgElemental = dmgElemental;
    }

    public Integer getDmgElementalPct() {
        return dmgElementalPct;
    }

    public void setDmgElementalPct(Integer dmgElementalPct) {
        this.dmgElementalPct = dmgElementalPct;
    }

    public Integer getDmgFire() {
        return dmgFire;
    }

    public void setDmgFire(Integer dmgFire) {
        this.dmgFire = dmgFire;
    }

    public Integer getDmgFirePct() {
        return dmgFirePct;
    }

    public void setDmgFirePct(Integer dmgFirePct) {
        this.dmgFirePct = dmgFirePct;
    }

    public Integer getDmgFrostburn() {
        return dmgFrostburn;
    }

    public void setDmgFrostburn(Integer dmgFrostburn) {
        this.dmgFrostburn = dmgFrostburn;
    }

    public Integer getDmgFrostburnPct() {
        return dmgFrostburnPct;
    }

    public void setDmgFrostburnPct(Integer dmgFrostburnPct) {
        this.dmgFrostburnPct = dmgFrostburnPct;
    }

    public Integer getDmgChaos() {
        return dmgChaos;
    }

    public void setDmgChaos(Integer dmgChaos) {
        this.dmgChaos = dmgChaos;
    }

    public Integer getDmgChaosPct() {
        return dmgChaosPct;
    }

    public void setDmgChaosPct(Integer dmgChaosPct) {
        this.dmgChaosPct = dmgChaosPct;
    }

    public Integer getDmgInternal() {
        return dmgInternal;
    }

    public void setDmgInternal(Integer dmgInternal) {
        this.dmgInternal = dmgInternal;
    }

    public Integer getDmgInternalPct() {
        return dmgInternalPct;
    }

    public void setDmgInternalPct(Integer dmgInternalPct) {
        this.dmgInternalPct = dmgInternalPct;
    }

    public Integer getDmgLightning() {
        return dmgLightning;
    }

    public void setDmgLightning(Integer dmgLightning) {
        this.dmgLightning = dmgLightning;
    }

    public Integer getDmgLightningPct() {
        return dmgLightningPct;
    }

    public void setDmgLightningPct(Integer dmgLightningPct) {
        this.dmgLightningPct = dmgLightningPct;
    }

    public Integer getDmgPhysical() {
        return dmgPhysical;
    }

    public void setDmgPhysical(Integer dmgPhysical) {
        this.dmgPhysical = dmgPhysical;
    }

    public Integer getDmgPhysicalPct() {
        return dmgPhysicalPct;
    }

    public void setDmgPhysicalPct(Integer dmgPhysicalPct) {
        this.dmgPhysicalPct = dmgPhysicalPct;
    }

    public Integer getDmgPierce() {
        return dmgPierce;
    }

    public void setDmgPierce(Integer dmgPierce) {
        this.dmgPierce = dmgPierce;
    }

    public Integer getDmgPiercePct() {
        return dmgPiercePct;
    }

    public void setDmgPiercePct(Integer dmgPiercePct) {
        this.dmgPiercePct = dmgPiercePct;
    }

    public Integer getDmgPoison() {
        return dmgPoison;
    }

    public void setDmgPoison(Integer dmgPoison) {
        this.dmgPoison = dmgPoison;
    }

    public Integer getDmgPoisonPct() {
        return dmgPoisonPct;
    }

    public void setDmgPoisonPct(Integer dmgPoisonPct) {
        this.dmgPoisonPct = dmgPoisonPct;
    }

    public Integer getDmgReflected() {
        return dmgReflected;
    }

    public void setDmgReflected(Integer dmgReflected) {
        this.dmgReflected = dmgReflected;
    }

    public Integer getDmgVitality() {
        return dmgVitality;
    }

    public void setDmgVitality(Integer dmgVitality) {
        this.dmgVitality = dmgVitality;
    }

    public Integer getDmgVitalityPct() {
        return dmgVitalityPct;
    }

    public void setDmgVitalityPct(Integer dmgVitalityPct) {
        this.dmgVitalityPct = dmgVitalityPct;
    }

    public Integer getDotVitalityDecay() {
        return dotVitalityDecay;
    }

    public void setDotVitalityDecay(Integer dotVitalityDecay) {
        this.dotVitalityDecay = dotVitalityDecay;
    }

    public Integer getDotVitalityDecayPct() {
        return dotVitalityDecayPct;
    }

    public void setDotVitalityDecayPct(Integer dotVitalityDecayPct) {
        this.dotVitalityDecayPct = dotVitalityDecayPct;
    }

    public Integer getEnergy() {
        return energy;
    }

    public void setEnergy(Integer energy) {
        this.energy = energy;
    }

    public Integer getEnergyAbsorbed() {
        return energyAbsorbed;
    }

    public void setEnergyAbsorbed(Integer energyAbsorbed) {
        this.energyAbsorbed = energyAbsorbed;
    }

    public Integer getEnergyPct() {
        return energyPct;
    }

    public void setEnergyPct(Integer energyPct) {
        this.energyPct = energyPct;
    }

    public Integer getEnergyRegenPct() {
        return energyRegenPct;
    }

    public void setEnergyRegenPct(Integer energyRegenPct) {
        this.energyRegenPct = energyRegenPct;
    }

    public Integer getEnergyRegenSec() {
        return energyRegenSec;
    }

    public void setEnergyRegenSec(Integer energyRegenSec) {
        this.energyRegenSec = energyRegenSec;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getHealthPct() {
        return healthPct;
    }

    public void setHealthPct(Integer healthPct) {
        this.healthPct = healthPct;
    }

    public Integer getHealthRegenPct() {
        return healthRegenPct;
    }

    public void setHealthRegenPct(Integer healthRegenPct) {
        this.healthRegenPct = healthRegenPct;
    }

    public Integer getHealthRegenSec() {
        return healthRegenSec;
    }

    public void setHealthRegenSec(Integer healthRegenSec) {
        this.healthRegenSec = healthRegenSec;
    }

    public Integer getLessDmgArachnids() {
        return lessDmgArachnids;
    }

    public void setLessDmgArachnids(Integer lessDmgArachnids) {
        this.lessDmgArachnids = lessDmgArachnids;
    }

    public Integer getLessDmgBeasts() {
        return lessDmgBeasts;
    }

    public void setLessDmgBeasts(Integer lessDmgBeasts) {
        this.lessDmgBeasts = lessDmgBeasts;
    }

    public Integer getLessDmgInsectoids() {
        return lessDmgInsectoids;
    }

    public void setLessDmgInsectoids(Integer lessDmgInsectoids) {
        this.lessDmgInsectoids = lessDmgInsectoids;
    }

    public Integer getLessDmgUndead() {
        return lessDmgUndead;
    }

    public void setLessDmgUndead(Integer lessDmgUndead) {
        this.lessDmgUndead = lessDmgUndead;
    }

    public Integer getMovement() {
        return movement;
    }

    public void setMovement(Integer movement) {
        this.movement = movement;
    }

    public Integer getPetAdcth() {
        return petAdcth;
    }

    public void setPetAdcth(Integer petAdcth) {
        this.petAdcth = petAdcth;
    }

    public Integer getPetAllDmg() {
        return petAllDmg;
    }

    public void setPetAllDmg(Integer petAllDmg) {
        this.petAllDmg = petAllDmg;
    }

    public Integer getPetArmorPct() {
        return petArmorPct;
    }

    public void setPetArmorPct(Integer petArmorPct) {
        this.petArmorPct = petArmorPct;
    }

    public Integer getPetAttackSpeed() {
        return petAttackSpeed;
    }

    public void setPetAttackSpeed(Integer petAttackSpeed) {
        this.petAttackSpeed = petAttackSpeed;
    }

    public Integer getPetDaPct() {
        return petDaPct;
    }

    public void setPetDaPct(Integer petDaPct) {
        this.petDaPct = petDaPct;
    }

    public Integer getPetDmgBleeding() {
        return petDmgBleeding;
    }

    public void setPetDmgBleeding(Integer petDmgBleeding) {
        this.petDmgBleeding = petDmgBleeding;
    }

    public Integer getPetDmgCrit() {
        return petDmgCrit;
    }

    public void setPetDmgCrit(Integer petDmgCrit) {
        this.petDmgCrit = petDmgCrit;
    }

    public Integer getPetDmgElemental() {
        return petDmgElemental;
    }

    public void setPetDmgElemental(Integer petDmgElemental) {
        this.petDmgElemental = petDmgElemental;
    }

    public Integer getPetDmgFire() {
        return petDmgFire;
    }

    public void setPetDmgFire(Integer petDmgFire) {
        this.petDmgFire = petDmgFire;
    }

    public Integer getPetDmgLightning() {
        return petDmgLightning;
    }

    public void setPetDmgLightning(Integer petDmgLightning) {
        this.petDmgLightning = petDmgLightning;
    }

    public Integer getPetDmgLightningPct() {
        return petDmgLightningPct;
    }

    public void setPetDmgLightningPct(Integer petDmgLightningPct) {
        this.petDmgLightningPct = petDmgLightningPct;
    }

    public Integer getPetDmgPoison() {
        return petDmgPoison;
    }

    public void setPetDmgPoison(Integer petDmgPoison) {
        this.petDmgPoison = petDmgPoison;
    }

    public Integer getPetHealthPct() {
        return petHealthPct;
    }

    public void setPetHealthPct(Integer petHealthPct) {
        this.petHealthPct = petHealthPct;
    }

    public Integer getPetHealthRegenPct() {
        return petHealthRegenPct;
    }

    public void setPetHealthRegenPct(Integer petHealthRegenPct) {
        this.petHealthRegenPct = petHealthRegenPct;
    }

    public Integer getPetHealthRegenSec() {
        return petHealthRegenSec;
    }

    public void setPetHealthRegenSec(Integer petHealthRegenSec) {
        this.petHealthRegenSec = petHealthRegenSec;
    }

    public Integer getPetOaPct() {
        return petOaPct;
    }

    public void setPetOaPct(Integer petOaPct) {
        this.petOaPct = petOaPct;
    }

    public Integer getPetResAether() {
        return petResAether;
    }

    public void setPetResAether(Integer petResAether) {
        this.petResAether = petResAether;
    }

    public Integer getPetResAllMax() {
        return petResAllMax;
    }

    public void setPetResAllMax(Integer petResAllMax) {
        this.petResAllMax = petResAllMax;
    }

    public Integer getPetResBleeding() {
        return petResBleeding;
    }

    public void setPetResBleeding(Integer petResBleeding) {
        this.petResBleeding = petResBleeding;
    }

    public Integer getPetResElemental() {
        return petResElemental;
    }

    public void setPetResElemental(Integer petResElemental) {
        this.petResElemental = petResElemental;
    }

    public Integer getPetResChaos() {
        return petResChaos;
    }

    public void setPetResChaos(Integer petResChaos) {
        this.petResChaos = petResChaos;
    }

    public Integer getPetResPhysical() {
        return petResPhysical;
    }

    public void setPetResPhysical(Integer petResPhysical) {
        this.petResPhysical = petResPhysical;
    }

    public Integer getPetResPierce() {
        return petResPierce;
    }

    public void setPetResPierce(Integer petResPierce) {
        this.petResPierce = petResPierce;
    }

    public Integer getPetResPoisonAcid() {
        return petResPoisonAcid;
    }

    public void setPetResPoisonAcid(Integer petResPoisonAcid) {
        this.petResPoisonAcid = petResPoisonAcid;
    }

    public Integer getPetResVitality() {
        return petResVitality;
    }

    public void setPetResVitality(Integer petResVitality) {
        this.petResVitality = petResVitality;
    }

    public Integer getPetRetAllDmg() {
        return petRetAllDmg;
    }

    public void setPetRetAllDmg(Integer petRetAllDmg) {
        this.petRetAllDmg = petRetAllDmg;
    }

    public Integer getPetRetPierce() {
        return petRetPierce;
    }

    public void setPetRetPierce(Integer petRetPierce) {
        this.petRetPierce = petRetPierce;
    }

    public Integer getPetTotalSpeed() {
        return petTotalSpeed;
    }

    public void setPetTotalSpeed(Integer petTotalSpeed) {
        this.petTotalSpeed = petTotalSpeed;
    }

    public Integer getRedBleedingDur() {
        return redBleedingDur;
    }

    public void setRedBleedingDur(Integer redBleedingDur) {
        this.redBleedingDur = redBleedingDur;
    }

    public Integer getRedBurnDur() {
        return redBurnDur;
    }

    public void setRedBurnDur(Integer redBurnDur) {
        this.redBurnDur = redBurnDur;
    }

    public Integer getRedElectrocuteDur() {
        return redElectrocuteDur;
    }

    public void setRedElectrocuteDur(Integer redElectrocuteDur) {
        this.redElectrocuteDur = redElectrocuteDur;
    }

    public Integer getRedElementalRes() {
        return redElementalRes;
    }

    public void setRedElementalRes(Integer redElementalRes) {
        this.redElementalRes = redElementalRes;
    }

    public Integer getRedEntrapmentDur() {
        return redEntrapmentDur;
    }

    public void setRedEntrapmentDur(Integer redEntrapmentDur) {
        this.redEntrapmentDur = redEntrapmentDur;
    }

    public Integer getRedFreezeDur() {
        return redFreezeDur;
    }

    public void setRedFreezeDur(Integer redFreezeDur) {
        this.redFreezeDur = redFreezeDur;
    }

    public Integer getRedFrostburnDur() {
        return redFrostburnDur;
    }

    public void setRedFrostburnDur(Integer redFrostburnDur) {
        this.redFrostburnDur = redFrostburnDur;
    }

    public Integer getRedInternalDur() {
        return redInternalDur;
    }

    public void setRedInternalDur(Integer redInternalDur) {
        this.redInternalDur = redInternalDur;
    }

    public Integer getRedLifeLeechDur() {
        return redLifeLeechDur;
    }

    public void setRedLifeLeechDur(Integer redLifeLeechDur) {
        this.redLifeLeechDur = redLifeLeechDur;
    }

    public Integer getRedPoisonDur() {
        return redPoisonDur;
    }

    public void setRedPoisonDur(Integer redPoisonDur) {
        this.redPoisonDur = redPoisonDur;
    }

    public Integer getRedReflectedDmg() {
        return redReflectedDmg;
    }

    public void setRedReflectedDmg(Integer redReflectedDmg) {
        this.redReflectedDmg = redReflectedDmg;
    }

    public Integer getRedStunDur() {
        return redStunDur;
    }

    public void setRedStunDur(Integer redStunDur) {
        this.redStunDur = redStunDur;
    }

    public Integer getRedVitalityDecayDur() {
        return redVitalityDecayDur;
    }

    public void setRedVitalityDecayDur(Integer redVitalityDecayDur) {
        this.redVitalityDecayDur = redVitalityDecayDur;
    }

    public Integer getReqCunningMelee() {
        return reqCunningMelee;
    }

    public void setReqCunningMelee(Integer reqCunningMelee) {
        this.reqCunningMelee = reqCunningMelee;
    }

    public Integer getReqCunningRanged() {
        return reqCunningRanged;
    }

    public void setReqCunningRanged(Integer reqCunningRanged) {
        this.reqCunningRanged = reqCunningRanged;
    }

    public Integer getReqPhysiqueMelee() {
        return reqPhysiqueMelee;
    }

    public void setReqPhysiqueMelee(Integer reqPhysiqueMelee) {
        this.reqPhysiqueMelee = reqPhysiqueMelee;
    }

    public Integer getReqPhysiqueShield() {
        return reqPhysiqueShield;
    }

    public void setReqPhysiqueShield(Integer reqPhysiqueShield) {
        this.reqPhysiqueShield = reqPhysiqueShield;
    }

    public Integer getReqSpiritJewelry() {
        return reqSpiritJewelry;
    }

    public void setReqSpiritJewelry(Integer reqSpiritJewelry) {
        this.reqSpiritJewelry = reqSpiritJewelry;
    }

    public Integer getReqSpiritWeapon() {
        return reqSpiritWeapon;
    }

    public void setReqSpiritWeapon(Integer reqSpiritWeapon) {
        this.reqSpiritWeapon = reqSpiritWeapon;
    }

    public Integer getResAether() {
        return resAether;
    }

    public void setResAether(Integer resAether) {
        this.resAether = resAether;
    }

    public Integer getResAetherMax() {
        return resAetherMax;
    }

    public void setResAetherMax(Integer resAetherMax) {
        this.resAetherMax = resAetherMax;
    }

    public Integer getResBleeding() {
        return resBleeding;
    }

    public void setResBleeding(Integer resBleeding) {
        this.resBleeding = resBleeding;
    }

    public Integer getResBleedingMax() {
        return resBleedingMax;
    }

    public void setResBleedingMax(Integer resBleedingMax) {
        this.resBleedingMax = resBleedingMax;
    }

    public Integer getResCold() {
        return resCold;
    }

    public void setResCold(Integer resCold) {
        this.resCold = resCold;
    }

    public Integer getResColdMax() {
        return resColdMax;
    }

    public void setResColdMax(Integer resColdMax) {
        this.resColdMax = resColdMax;
    }

    public Integer getResElemental() {
        return resElemental;
    }

    public void setResElemental(Integer resElemental) {
        this.resElemental = resElemental;
    }

    public Integer getResEnergyLeech() {
        return resEnergyLeech;
    }

    public void setResEnergyLeech(Integer resEnergyLeech) {
        this.resEnergyLeech = resEnergyLeech;
    }

    public Integer getResFire() {
        return resFire;
    }

    public void setResFire(Integer resFire) {
        this.resFire = resFire;
    }

    public Integer getResChaos() {
        return resChaos;
    }

    public void setResChaos(Integer resChaos) {
        this.resChaos = resChaos;
    }

    public Integer getResChaosMax() {
        return resChaosMax;
    }

    public void setResChaosMax(Integer resChaosMax) {
        this.resChaosMax = resChaosMax;
    }

    public Integer getResLifeLeech() {
        return resLifeLeech;
    }

    public void setResLifeLeech(Integer resLifeLeech) {
        this.resLifeLeech = resLifeLeech;
    }

    public Integer getResLightning() {
        return resLightning;
    }

    public void setResLightning(Integer resLightning) {
        this.resLightning = resLightning;
    }

    public Integer getResLightningMax() {
        return resLightningMax;
    }

    public void setResLightningMax(Integer resLightningMax) {
        this.resLightningMax = resLightningMax;
    }

    public Integer getResPhysical() {
        return resPhysical;
    }

    public void setResPhysical(Integer resPhysical) {
        this.resPhysical = resPhysical;
    }

    public Integer getResPierce() {
        return resPierce;
    }

    public void setResPierce(Integer resPierce) {
        this.resPierce = resPierce;
    }

    public Integer getResPierceMax() {
        return resPierceMax;
    }

    public void setResPierceMax(Integer resPierceMax) {
        this.resPierceMax = resPierceMax;
    }

    public Integer getResPoisonAcid() {
        return resPoisonAcid;
    }

    public void setResPoisonAcid(Integer resPoisonAcid) {
        this.resPoisonAcid = resPoisonAcid;
    }

    public Integer getResPoisonAcidMax() {
        return resPoisonAcidMax;
    }

    public void setResPoisonAcidMax(Integer resPoisonAcidMax) {
        this.resPoisonAcidMax = resPoisonAcidMax;
    }

    public Integer getResSlow() {
        return resSlow;
    }

    public void setResSlow(Integer resSlow) {
        this.resSlow = resSlow;
    }

    public Integer getResVitality() {
        return resVitality;
    }

    public void setResVitality(Integer resVitality) {
        this.resVitality = resVitality;
    }

    public Integer getResVitalityMax() {
        return resVitalityMax;
    }

    public void setResVitalityMax(Integer resVitalityMax) {
        this.resVitalityMax = resVitalityMax;
    }

    public Integer getRetAllDmg() {
        return retAllDmg;
    }

    public void setRetAllDmg(Integer retAllDmg) {
        this.retAllDmg = retAllDmg;
    }

    public Integer getRetFire() {
        return retFire;
    }

    public void setRetFire(Integer retFire) {
        this.retFire = retFire;
    }

    public Integer getRetChaos() {
        return retChaos;
    }

    public void setRetChaos(Integer retChaos) {
        this.retChaos = retChaos;
    }

    public Integer getRetPhysical() {
        return retPhysical;
    }

    public void setRetPhysical(Integer retPhysical) {
        this.retPhysical = retPhysical;
    }

    public Integer getRetPierce() {
        return retPierce;
    }

    public void setRetPierce(Integer retPierce) {
        this.retPierce = retPierce;
    }

    public Integer getRetReducedAttackSpeed() {
        return retReducedAttackSpeed;
    }

    public void setRetReducedAttackSpeed(Integer retReducedAttackSpeed) {
        this.retReducedAttackSpeed = retReducedAttackSpeed;
    }

    public Integer getRetSlowedMovement() {
        return retSlowedMovement;
    }

    public void setRetSlowedMovement(Integer retSlowedMovement) {
        this.retSlowedMovement = retSlowedMovement;
    }

    public Integer getRetVitalityDecay() {
        return retVitalityDecay;
    }

    public void setRetVitalityDecay(Integer retVitalityDecay) {
        this.retVitalityDecay = retVitalityDecay;
    }

    public Integer getShieldBlockChance() {
        return shieldBlockChance;
    }

    public void setShieldBlockChance(Integer shieldBlockChance) {
        this.shieldBlockChance = shieldBlockChance;
    }

    public Integer getShieldDmgBlocked() {
        return shieldDmgBlocked;
    }

    public void setShieldDmgBlocked(Integer shieldDmgBlocked) {
        this.shieldDmgBlocked = shieldDmgBlocked;
    }

    public Integer getShieldRecovery() {
        return shieldRecovery;
    }

    public void setShieldRecovery(Integer shieldRecovery) {
        this.shieldRecovery = shieldRecovery;
    }

    public Integer getSkillDisruptProtect() {
        return skillDisruptProtect;
    }

    public void setSkillDisruptProtect(Integer skillDisruptProtect) {
        this.skillDisruptProtect = skillDisruptProtect;
    }

    public Integer getSkillEnergyCostPct() {
        return skillEnergyCostPct;
    }

    public void setSkillEnergyCostPct(Integer skillEnergyCostPct) {
        this.skillEnergyCostPct = skillEnergyCostPct;
    }

    public Integer getStunDuration() {
        return stunDuration;
    }

    public void setStunDuration(Integer stunDuration) {
        this.stunDuration = stunDuration;
    }

    public Integer getStunChance() {
        return stunChance;
    }

    public void setStunChance(Integer stunChance) {
        this.stunChance = stunChance;
    }

    public Integer getTotalSpeed() {
        return totalSpeed;
    }

    public void setTotalSpeed(Integer totalSpeed) {
        this.totalSpeed = totalSpeed;
    }

    public Integer getVsBeastsDmgPct() {
        return vsBeastsDmgPct;
    }

    public void setVsBeastsDmgPct(Integer vsBeastsDmgPct) {
        this.vsBeastsDmgPct = vsBeastsDmgPct;
    }

    public Integer getVsHumansDmgPct() {
        return vsHumansDmgPct;
    }

    public void setVsHumansDmgPct(Integer vsHumansDmgPct) {
        this.vsHumansDmgPct = vsHumansDmgPct;
    }

    public Integer getVsChthonicsDmgPct() {
        return vsChthonicsDmgPct;
    }

    public void setVsChthonicsDmgPct(Integer vsChthonicsDmgPct) {
        this.vsChthonicsDmgPct = vsChthonicsDmgPct;
    }

    public Integer getVsUndeadDmgPct() {
        return vsUndeadDmgPct;
    }

    public void setVsUndeadDmgPct(Integer vsUndeadDmgPct) {
        this.vsUndeadDmgPct = vsUndeadDmgPct;
    }
}
