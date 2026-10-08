package p046f2;

import fr.t;
import p071kotlin.Metadata;
import r0.s;

/* JADX INFO: renamed from: f2.nb, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0083\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lf2/nb;", "", "Lr0/s;", "keyboards", "mice", "<init>", "(Lr0/s;Lr0/s;)V", "a", "(Lr0/s;Lr0/s;)Lf2/nb;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lr0/s;", "b", "()Lr0/s;", "c", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class Devices {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final s keyboards;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final s mice;

    public Devices(s sVar, s sVar2) {
        this.keyboards = sVar;
        this.mice = sVar2;
    }

    public final Devices a(s keyboards, s mice) {
        return new Devices(keyboards, mice);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final s getKeyboards() {
        return this.keyboards;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final s getMice() {
        return this.mice;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Devices)) {
            return false;
        }
        Devices devices = (Devices) other;
        return t.c(this.keyboards, devices.keyboards) && t.c(this.mice, devices.mice);
    }

    public int hashCode() {
        return (this.keyboards.hashCode() * 31) + this.mice.hashCode();
    }

    public String toString() {
        return "Devices(keyboards=" + this.keyboards + ", mice=" + this.mice + ')';
    }
}
