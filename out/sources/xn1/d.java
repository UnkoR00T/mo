package xn1;

import al0.ParentOrGuardData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\n\u000b\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lxn1/d;", "", "Lmm1/a;", "getType", "()Lmm1/a;", "type", "a", "d", "b", "c", "Lxn1/d$a;", "Lxn1/f;", "Lxn1/d$d;", "dependentidsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lxn1/d$a;", "Lxn1/d;", "Lhb4/c;", "a", "()Lhb4/c;", "vmsAdapter", "Lxn1/e;", "Lxn1/g;", "dependentidsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends d {
        hb4.c a();
    }

    /* JADX INFO: renamed from: xn1.d$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lxn1/d$b;", "Lxn1/d$d;", "Lmm1/a;", "type", "Lal0/j0;", "parentOrGuardData", "<init>", "(Lmm1/a;Lal0/j0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmm1/a;", "getType", "()Lmm1/a;", "b", "Lal0/j0;", "f", "()Lal0/j0;", "dependentidsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements InterfaceC5873d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final mm1.a type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ParentOrGuardData parentOrGuardData;

        public Initialized(mm1.a aVar, ParentOrGuardData parentOrGuardData) {
            this.type = aVar;
            this.parentOrGuardData = parentOrGuardData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return this.type == initialized.type && fr.t.c(this.parentOrGuardData, initialized.parentOrGuardData);
        }

        @Override // xn1.d.InterfaceC5873d
        /* JADX INFO: renamed from: f, reason: from getter */
        public ParentOrGuardData getParentOrGuardData() {
            return this.parentOrGuardData;
        }

        @Override // xn1.d
        public mm1.a getType() {
            return this.type;
        }

        public int hashCode() {
            return (this.type.hashCode() * 31) + this.parentOrGuardData.hashCode();
        }

        public String toString() {
            return "Initialized(type=" + this.type + ", parentOrGuardData=" + this.parentOrGuardData + ')';
        }
    }

    /* JADX INFO: renamed from: xn1.d$c, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lxn1/d$c;", "Lxn1/d$d;", "Lmm1/a;", "type", "Lal0/j0;", "parentOrGuardData", "<init>", "(Lmm1/a;Lal0/j0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmm1/a;", "getType", "()Lmm1/a;", "b", "Lal0/j0;", "f", "()Lal0/j0;", "dependentidsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InitializedWithTrustedProfile implements InterfaceC5873d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final mm1.a type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ParentOrGuardData parentOrGuardData;

        public InitializedWithTrustedProfile(mm1.a aVar, ParentOrGuardData parentOrGuardData) {
            this.type = aVar;
            this.parentOrGuardData = parentOrGuardData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InitializedWithTrustedProfile)) {
                return false;
            }
            InitializedWithTrustedProfile initializedWithTrustedProfile = (InitializedWithTrustedProfile) other;
            return this.type == initializedWithTrustedProfile.type && fr.t.c(this.parentOrGuardData, initializedWithTrustedProfile.parentOrGuardData);
        }

        @Override // xn1.d.InterfaceC5873d
        /* JADX INFO: renamed from: f, reason: from getter */
        public ParentOrGuardData getParentOrGuardData() {
            return this.parentOrGuardData;
        }

        @Override // xn1.d
        public mm1.a getType() {
            return this.type;
        }

        public int hashCode() {
            return (this.type.hashCode() * 31) + this.parentOrGuardData.hashCode();
        }

        public String toString() {
            return "InitializedWithTrustedProfile(type=" + this.type + ", parentOrGuardData=" + this.parentOrGuardData + ')';
        }
    }

    /* JADX INFO: renamed from: xn1.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\u0006\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lxn1/d$d;", "Lxn1/d;", "Lal0/j0;", "f", "()Lal0/j0;", "parentOrGuardData", "Lxn1/h;", "Lxn1/d$b;", "Lxn1/d$c;", "dependentidsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC5873d extends d {
        /* JADX INFO: renamed from: f */
        ParentOrGuardData getParentOrGuardData();
    }

    mm1.a getType();
}
