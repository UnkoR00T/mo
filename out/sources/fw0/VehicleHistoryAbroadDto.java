package fw0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: fw0.q3, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001b"}, d2 = {"Lfw0/q3;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lfw0/e;", "a", "Lfw0/e;", "()Lfw0/e;", "autoDnaDto", "Lfw0/i;", "b", "Lfw0/i;", "()Lfw0/i;", "carVerticalDto", "Lfw0/j;", "c", "Lfw0/j;", "()Lfw0/j;", "carfaxDto", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleHistoryAbroadDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("autoDnaDto")
    private final AutoDnaDto autoDnaDto;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("carVerticalDto")
    private final CarVerticalDto carVerticalDto;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("carfaxDto")
    private final CarfaxDto carfaxDto;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AutoDnaDto getAutoDnaDto() {
        return this.autoDnaDto;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final CarVerticalDto getCarVerticalDto() {
        return this.carVerticalDto;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final CarfaxDto getCarfaxDto() {
        return this.carfaxDto;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleHistoryAbroadDto)) {
            return false;
        }
        VehicleHistoryAbroadDto vehicleHistoryAbroadDto = (VehicleHistoryAbroadDto) other;
        return fr.t.c(this.autoDnaDto, vehicleHistoryAbroadDto.autoDnaDto) && fr.t.c(this.carVerticalDto, vehicleHistoryAbroadDto.carVerticalDto) && fr.t.c(this.carfaxDto, vehicleHistoryAbroadDto.carfaxDto);
    }

    public int hashCode() {
        return (((this.autoDnaDto.hashCode() * 31) + this.carVerticalDto.hashCode()) * 31) + this.carfaxDto.hashCode();
    }

    public String toString() {
        return "VehicleHistoryAbroadDto(autoDnaDto=" + this.autoDnaDto + ", carVerticalDto=" + this.carVerticalDto + ", carfaxDto=" + this.carfaxDto + ')';
    }
}
