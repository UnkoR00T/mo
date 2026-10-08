package hd2;

import al0.IdentityCardSuspensionData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lhd2/d;", "", "a", "d", "b", "c", "Lhd2/d$a;", "Lhd2/f;", "Lhd2/d$d;", "identitycardsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lhd2/d$a;", "Lhd2/d;", "Lhb4/c;", "a", "()Lhb4/c;", "vmsAdapter", "Lhd2/e;", "Lhd2/g;", "identitycardsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends d {
        hb4.c a();
    }

    /* JADX INFO: renamed from: hd2.d$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lhd2/d$b;", "Lhd2/d$d;", "Lal0/f0;", "data", "<init>", "(Lal0/f0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lal0/f0;", "getData", "()Lal0/f0;", "identitycardsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements InterfaceC1927d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final IdentityCardSuspensionData data;

        public Initialized(IdentityCardSuspensionData identityCardSuspensionData) {
            this.data = identityCardSuspensionData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Initialized) && fr.t.c(this.data, ((Initialized) other).data);
        }

        @Override // hd2.d.InterfaceC1927d
        public IdentityCardSuspensionData getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "Initialized(data=" + this.data + ')';
        }
    }

    /* JADX INFO: renamed from: hd2.d$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lhd2/d$c;", "Lhd2/d$d;", "Lal0/f0;", "data", "<init>", "(Lal0/f0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lal0/f0;", "getData", "()Lal0/f0;", "identitycardsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InitializedWithTrustedProfile implements InterfaceC1927d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final IdentityCardSuspensionData data;

        public InitializedWithTrustedProfile(IdentityCardSuspensionData identityCardSuspensionData) {
            this.data = identityCardSuspensionData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InitializedWithTrustedProfile) && fr.t.c(this.data, ((InitializedWithTrustedProfile) other).data);
        }

        @Override // hd2.d.InterfaceC1927d
        public IdentityCardSuspensionData getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "InitializedWithTrustedProfile(data=" + this.data + ')';
        }
    }

    /* JADX INFO: renamed from: hd2.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\u0006\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lhd2/d$d;", "Lhd2/d;", "Lal0/f0;", "getData", "()Lal0/f0;", "data", "Lhd2/h;", "Lhd2/d$b;", "Lhd2/d$c;", "identitycardsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC1927d extends d {
        IdentityCardSuspensionData getData();
    }
}
