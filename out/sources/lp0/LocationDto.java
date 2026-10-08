package lp0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: lp0.c0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Llp0/c0;", "", "Llp0/q;", "geometry", "Llp0/d0;", "properties", "<init>", "(Llp0/q;Llp0/d0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Llp0/q;", "getGeometry", "()Llp0/q;", "b", "Llp0/d0;", "getProperties", "()Llp0/d0;", "frontsrv_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LocationDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("geometry")
    private final GeometryDto geometry;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("properties")
    private final PropertiesDto properties;

    public LocationDto(GeometryDto geometryDto, PropertiesDto propertiesDto) {
        this.geometry = geometryDto;
        this.properties = propertiesDto;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocationDto)) {
            return false;
        }
        LocationDto locationDto = (LocationDto) other;
        return fr.t.c(this.geometry, locationDto.geometry) && fr.t.c(this.properties, locationDto.properties);
    }

    public int hashCode() {
        return (this.geometry.hashCode() * 31) + this.properties.hashCode();
    }

    public String toString() {
        return "LocationDto(geometry=" + this.geometry + ", properties=" + this.properties + ')';
    }
}
