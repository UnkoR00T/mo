package pl.gov.coi.mobywatel.feature.vehiclecollision.data.model;

import androidx.annotation.Keep;
import fr.k;
import fr.t;
import java.util.List;
import java.util.Map;
import p071kotlin.Metadata;
import pq.v;
import pq.v0;
import rd3.StoredMetadataDto;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f\u0012\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00020\b\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u001c\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fHÆ\u0003¢\u0006\u0004\b+\u0010(J\u001c\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00020\bHÆ\u0003¢\u0006\u0004\b,\u0010\"J\u0012\u0010-\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b-\u0010.J¬\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f2\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00020\b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b1\u0010\u001cJ\u0010\u00103\u001a\u000202HÖ\u0001¢\u0006\u0004\b3\u00104J\u001a\u00107\u001a\u0002062\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b7\u00108R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b<\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010=\u001a\u0004\b>\u0010 R&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010?\u001a\u0004\b@\u0010\"R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010A\u001a\u0004\bB\u0010$R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010C\u001a\u0004\bD\u0010&R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010E\u001a\u0004\bF\u0010(R\u001a\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010G\u001a\u0004\bH\u0010*R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010E\u001a\u0004\bI\u0010(R&\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010?\u001a\u0004\bJ\u0010\"R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010K\u001a\u0004\bL\u0010.¨\u0006M"}, d2 = {"Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftDto;", "", "", "processId", "Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftStepDto;", "step", "Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftDamageDto;", "damage", "", "Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftVehiclesPageDto;", "vehiclesPages", "Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftVehicleDto;", "selectedVehicle", "Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftVehicleOwnerDetailsDto;", "selectedVehicleOwnerDetails", "", "Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftPhotoDto;", "photos", "Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftPersonalDataDto;", "personalDetails", "additionalVehicles", "Lrd3/d;", "originalPhotoNames", "Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftDescriptionDto;", "description", "<init>", "(Ljava/lang/String;Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftStepDto;Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftDamageDto;Ljava/util/Map;Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftVehicleDto;Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftVehicleOwnerDetailsDto;Ljava/util/List;Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftPersonalDataDto;Ljava/util/List;Ljava/util/Map;Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftDescriptionDto;)V", "component1", "()Ljava/lang/String;", "component2", "()Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftStepDto;", "component3", "()Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftDamageDto;", "component4", "()Ljava/util/Map;", "component5", "()Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftVehicleDto;", "component6", "()Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftVehicleOwnerDetailsDto;", "component7", "()Ljava/util/List;", "component8", "()Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftPersonalDataDto;", "component9", "component10", "component11", "()Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftDescriptionDto;", "copy", "(Ljava/lang/String;Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftStepDto;Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftDamageDto;Ljava/util/Map;Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftVehicleDto;Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftVehicleOwnerDetailsDto;Ljava/util/List;Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftPersonalDataDto;Ljava/util/List;Ljava/util/Map;Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftDescriptionDto;)Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftDto;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProcessId", "Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftStepDto;", "getStep", "Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftDamageDto;", "getDamage", "Ljava/util/Map;", "getVehiclesPages", "Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftVehicleDto;", "getSelectedVehicle", "Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftVehicleOwnerDetailsDto;", "getSelectedVehicleOwnerDetails", "Ljava/util/List;", "getPhotos", "Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftPersonalDataDto;", "getPersonalDetails", "getAdditionalVehicles", "getOriginalPhotoNames", "Lpl/gov/coi/mobywatel/feature/vehiclecollision/data/model/CollisionDraftDescriptionDto;", "getDescription", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CollisionDraftDto {
    public static final int $stable = 8;

    @c("additionalVehicles")
    private final List<CollisionDraftVehicleDto> additionalVehicles;

    @c("damage")
    private final CollisionDraftDamageDto damage;

    @c("descriptionChapter")
    private final CollisionDraftDescriptionDto description;

    @c("originalPhotoNames")
    private final Map<StoredMetadataDto, String> originalPhotoNames;

    @c("personalDetails")
    private final CollisionDraftPersonalDataDto personalDetails;

    @c("photos")
    private final List<CollisionDraftPhotoDto> photos;

    @c("processId")
    private final String processId;

    @c("selectedVehicle")
    private final CollisionDraftVehicleDto selectedVehicle;

    @c("selectedVehicleOwnerDetails")
    private final CollisionDraftVehicleOwnerDetailsDto selectedVehicleOwnerDetails;

    @c("step")
    private final CollisionDraftStepDto step;

    @c("vehiclesPages")
    private final Map<String, CollisionDraftVehiclesPageDto> vehiclesPages;

    public CollisionDraftDto(String str, CollisionDraftStepDto collisionDraftStepDto, CollisionDraftDamageDto collisionDraftDamageDto, Map<String, CollisionDraftVehiclesPageDto> map, CollisionDraftVehicleDto collisionDraftVehicleDto, CollisionDraftVehicleOwnerDetailsDto collisionDraftVehicleOwnerDetailsDto, List<CollisionDraftPhotoDto> list, CollisionDraftPersonalDataDto collisionDraftPersonalDataDto, List<CollisionDraftVehicleDto> list2, Map<StoredMetadataDto, String> map2, CollisionDraftDescriptionDto collisionDraftDescriptionDto) {
        this.processId = str;
        this.step = collisionDraftStepDto;
        this.damage = collisionDraftDamageDto;
        this.vehiclesPages = map;
        this.selectedVehicle = collisionDraftVehicleDto;
        this.selectedVehicleOwnerDetails = collisionDraftVehicleOwnerDetailsDto;
        this.photos = list;
        this.personalDetails = collisionDraftPersonalDataDto;
        this.additionalVehicles = list2;
        this.originalPhotoNames = map2;
        this.description = collisionDraftDescriptionDto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CollisionDraftDto copy$default(CollisionDraftDto collisionDraftDto, String str, CollisionDraftStepDto collisionDraftStepDto, CollisionDraftDamageDto collisionDraftDamageDto, Map map, CollisionDraftVehicleDto collisionDraftVehicleDto, CollisionDraftVehicleOwnerDetailsDto collisionDraftVehicleOwnerDetailsDto, List list, CollisionDraftPersonalDataDto collisionDraftPersonalDataDto, List list2, Map map2, CollisionDraftDescriptionDto collisionDraftDescriptionDto, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = collisionDraftDto.processId;
        }
        if ((i15 & 2) != 0) {
            collisionDraftStepDto = collisionDraftDto.step;
        }
        if ((i15 & 4) != 0) {
            collisionDraftDamageDto = collisionDraftDto.damage;
        }
        if ((i15 & 8) != 0) {
            map = collisionDraftDto.vehiclesPages;
        }
        if ((i15 & 16) != 0) {
            collisionDraftVehicleDto = collisionDraftDto.selectedVehicle;
        }
        if ((i15 & 32) != 0) {
            collisionDraftVehicleOwnerDetailsDto = collisionDraftDto.selectedVehicleOwnerDetails;
        }
        if ((i15 & 64) != 0) {
            list = collisionDraftDto.photos;
        }
        if ((i15 & 128) != 0) {
            collisionDraftPersonalDataDto = collisionDraftDto.personalDetails;
        }
        if ((i15 & 256) != 0) {
            list2 = collisionDraftDto.additionalVehicles;
        }
        if ((i15 & 512) != 0) {
            map2 = collisionDraftDto.originalPhotoNames;
        }
        if ((i15 & 1024) != 0) {
            collisionDraftDescriptionDto = collisionDraftDto.description;
        }
        Map map3 = map2;
        CollisionDraftDescriptionDto collisionDraftDescriptionDto2 = collisionDraftDescriptionDto;
        CollisionDraftPersonalDataDto collisionDraftPersonalDataDto2 = collisionDraftPersonalDataDto;
        List list3 = list2;
        CollisionDraftVehicleOwnerDetailsDto collisionDraftVehicleOwnerDetailsDto2 = collisionDraftVehicleOwnerDetailsDto;
        List list4 = list;
        CollisionDraftVehicleDto collisionDraftVehicleDto2 = collisionDraftVehicleDto;
        CollisionDraftDamageDto collisionDraftDamageDto2 = collisionDraftDamageDto;
        return collisionDraftDto.copy(str, collisionDraftStepDto, collisionDraftDamageDto2, map, collisionDraftVehicleDto2, collisionDraftVehicleOwnerDetailsDto2, list4, collisionDraftPersonalDataDto2, list3, map3, collisionDraftDescriptionDto2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getProcessId() {
        return this.processId;
    }

    public final Map<StoredMetadataDto, String> component10() {
        return this.originalPhotoNames;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final CollisionDraftDescriptionDto getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CollisionDraftStepDto getStep() {
        return this.step;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CollisionDraftDamageDto getDamage() {
        return this.damage;
    }

    public final Map<String, CollisionDraftVehiclesPageDto> component4() {
        return this.vehiclesPages;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final CollisionDraftVehicleDto getSelectedVehicle() {
        return this.selectedVehicle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final CollisionDraftVehicleOwnerDetailsDto getSelectedVehicleOwnerDetails() {
        return this.selectedVehicleOwnerDetails;
    }

    public final List<CollisionDraftPhotoDto> component7() {
        return this.photos;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final CollisionDraftPersonalDataDto getPersonalDetails() {
        return this.personalDetails;
    }

    public final List<CollisionDraftVehicleDto> component9() {
        return this.additionalVehicles;
    }

    public final CollisionDraftDto copy(String processId, CollisionDraftStepDto step, CollisionDraftDamageDto damage, Map<String, CollisionDraftVehiclesPageDto> vehiclesPages, CollisionDraftVehicleDto selectedVehicle, CollisionDraftVehicleOwnerDetailsDto selectedVehicleOwnerDetails, List<CollisionDraftPhotoDto> photos, CollisionDraftPersonalDataDto personalDetails, List<CollisionDraftVehicleDto> additionalVehicles, Map<StoredMetadataDto, String> originalPhotoNames, CollisionDraftDescriptionDto description) {
        return new CollisionDraftDto(processId, step, damage, vehiclesPages, selectedVehicle, selectedVehicleOwnerDetails, photos, personalDetails, additionalVehicles, originalPhotoNames, description);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CollisionDraftDto)) {
            return false;
        }
        CollisionDraftDto collisionDraftDto = (CollisionDraftDto) other;
        return t.c(this.processId, collisionDraftDto.processId) && this.step == collisionDraftDto.step && t.c(this.damage, collisionDraftDto.damage) && t.c(this.vehiclesPages, collisionDraftDto.vehiclesPages) && t.c(this.selectedVehicle, collisionDraftDto.selectedVehicle) && t.c(this.selectedVehicleOwnerDetails, collisionDraftDto.selectedVehicleOwnerDetails) && t.c(this.photos, collisionDraftDto.photos) && t.c(this.personalDetails, collisionDraftDto.personalDetails) && t.c(this.additionalVehicles, collisionDraftDto.additionalVehicles) && t.c(this.originalPhotoNames, collisionDraftDto.originalPhotoNames) && t.c(this.description, collisionDraftDto.description);
    }

    public final List<CollisionDraftVehicleDto> getAdditionalVehicles() {
        return this.additionalVehicles;
    }

    public final CollisionDraftDamageDto getDamage() {
        return this.damage;
    }

    public final CollisionDraftDescriptionDto getDescription() {
        return this.description;
    }

    public final Map<StoredMetadataDto, String> getOriginalPhotoNames() {
        return this.originalPhotoNames;
    }

    public final CollisionDraftPersonalDataDto getPersonalDetails() {
        return this.personalDetails;
    }

    public final List<CollisionDraftPhotoDto> getPhotos() {
        return this.photos;
    }

    public final String getProcessId() {
        return this.processId;
    }

    public final CollisionDraftVehicleDto getSelectedVehicle() {
        return this.selectedVehicle;
    }

    public final CollisionDraftVehicleOwnerDetailsDto getSelectedVehicleOwnerDetails() {
        return this.selectedVehicleOwnerDetails;
    }

    public final CollisionDraftStepDto getStep() {
        return this.step;
    }

    public final Map<String, CollisionDraftVehiclesPageDto> getVehiclesPages() {
        return this.vehiclesPages;
    }

    public int hashCode() {
        int iHashCode = this.processId.hashCode() * 31;
        CollisionDraftStepDto collisionDraftStepDto = this.step;
        int iHashCode2 = (iHashCode + (collisionDraftStepDto == null ? 0 : collisionDraftStepDto.hashCode())) * 31;
        CollisionDraftDamageDto collisionDraftDamageDto = this.damage;
        int iHashCode3 = (((iHashCode2 + (collisionDraftDamageDto == null ? 0 : collisionDraftDamageDto.hashCode())) * 31) + this.vehiclesPages.hashCode()) * 31;
        CollisionDraftVehicleDto collisionDraftVehicleDto = this.selectedVehicle;
        int iHashCode4 = (iHashCode3 + (collisionDraftVehicleDto == null ? 0 : collisionDraftVehicleDto.hashCode())) * 31;
        CollisionDraftVehicleOwnerDetailsDto collisionDraftVehicleOwnerDetailsDto = this.selectedVehicleOwnerDetails;
        int iHashCode5 = (((((((((iHashCode4 + (collisionDraftVehicleOwnerDetailsDto == null ? 0 : collisionDraftVehicleOwnerDetailsDto.hashCode())) * 31) + this.photos.hashCode()) * 31) + this.personalDetails.hashCode()) * 31) + this.additionalVehicles.hashCode()) * 31) + this.originalPhotoNames.hashCode()) * 31;
        CollisionDraftDescriptionDto collisionDraftDescriptionDto = this.description;
        return iHashCode5 + (collisionDraftDescriptionDto != null ? collisionDraftDescriptionDto.hashCode() : 0);
    }

    public String toString() {
        return "CollisionDraftDto(processId=" + this.processId + ", step=" + this.step + ", damage=" + this.damage + ", vehiclesPages=" + this.vehiclesPages + ", selectedVehicle=" + this.selectedVehicle + ", selectedVehicleOwnerDetails=" + this.selectedVehicleOwnerDetails + ", photos=" + this.photos + ", personalDetails=" + this.personalDetails + ", additionalVehicles=" + this.additionalVehicles + ", originalPhotoNames=" + this.originalPhotoNames + ", description=" + this.description + ')';
    }

    public /* synthetic */ CollisionDraftDto(String str, CollisionDraftStepDto collisionDraftStepDto, CollisionDraftDamageDto collisionDraftDamageDto, Map map, CollisionDraftVehicleDto collisionDraftVehicleDto, CollisionDraftVehicleOwnerDetailsDto collisionDraftVehicleOwnerDetailsDto, List list, CollisionDraftPersonalDataDto collisionDraftPersonalDataDto, List list2, Map map2, CollisionDraftDescriptionDto collisionDraftDescriptionDto, int i15, k kVar) {
        this(str, (i15 & 2) != 0 ? null : collisionDraftStepDto, (i15 & 4) != 0 ? null : collisionDraftDamageDto, (i15 & 8) != 0 ? v0.i() : map, (i15 & 16) != 0 ? null : collisionDraftVehicleDto, (i15 & 32) != 0 ? null : collisionDraftVehicleOwnerDetailsDto, (i15 & 64) != 0 ? v.n() : list, collisionDraftPersonalDataDto, (i15 & 256) != 0 ? v.n() : list2, (i15 & 512) != 0 ? v0.i() : map2, (i15 & 1024) != 0 ? null : collisionDraftDescriptionDto);
    }
}
