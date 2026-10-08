package bm1;

import al0.ParentOrGuardData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lbm1/d;", "", "Lkk1/a;", "getType", "()Lkk1/a;", "type", "a", "b", "c", "Lbm1/d$b;", "Lbm1/d$c;", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lbm1/d$a;", "", "Lhb4/c;", "a", "()Lhb4/c;", "vmsAdapter", "Lbm1/e;", "Lbm1/g;", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        hb4.c a();
    }

    /* JADX INFO: renamed from: bm1.d$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lbm1/d$b;", "Lbm1/d;", "Lkk1/a;", "type", "Lal0/j0;", "parentOrGuardData", "<init>", "(Lkk1/a;Lal0/j0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkk1/a;", "getType", "()Lkk1/a;", "b", "Lal0/j0;", "()Lal0/j0;", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final kk1.a type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ParentOrGuardData parentOrGuardData;

        public Initialized(kk1.a aVar, ParentOrGuardData parentOrGuardData) {
            this.type = aVar;
            this.parentOrGuardData = parentOrGuardData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ParentOrGuardData getParentOrGuardData() {
            return this.parentOrGuardData;
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

        @Override // bm1.d
        public kk1.a getType() {
            return this.type;
        }

        public int hashCode() {
            return (this.type.hashCode() * 31) + this.parentOrGuardData.hashCode();
        }

        public String toString() {
            return "Initialized(type=" + this.type + ", parentOrGuardData=" + this.parentOrGuardData + ')';
        }
    }

    /* JADX INFO: renamed from: bm1.d$c, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lbm1/d$c;", "Lbm1/d;", "Lkk1/a;", "type", "Lal0/j0;", "parentOrGuardData", "<init>", "(Lkk1/a;Lal0/j0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkk1/a;", "getType", "()Lkk1/a;", "b", "Lal0/j0;", "()Lal0/j0;", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InitializedWithTrustedProfile implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final kk1.a type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ParentOrGuardData parentOrGuardData;

        public InitializedWithTrustedProfile(kk1.a aVar, ParentOrGuardData parentOrGuardData) {
            this.type = aVar;
            this.parentOrGuardData = parentOrGuardData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ParentOrGuardData getParentOrGuardData() {
            return this.parentOrGuardData;
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

        @Override // bm1.d
        public kk1.a getType() {
            return this.type;
        }

        public int hashCode() {
            return (this.type.hashCode() * 31) + this.parentOrGuardData.hashCode();
        }

        public String toString() {
            return "InitializedWithTrustedProfile(type=" + this.type + ", parentOrGuardData=" + this.parentOrGuardData + ')';
        }
    }

    kk1.a getType();
}
