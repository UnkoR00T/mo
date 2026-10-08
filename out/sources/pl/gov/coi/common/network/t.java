package pl.gov.coi.common.network;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0003\u0006\u0007\bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\t\n\u000b\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lpl/gov/coi/common/network/t;", "", "Lp00/h;", "a", "()Lp00/h;", "interceptorsProfile", "b", "c", "d", "Lpl/gov/coi/common/network/t$a;", "Lpl/gov/coi/common/network/t$b;", "Lpl/gov/coi/common/network/t$c;", "Lpl/gov/coi/common/network/t$d;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface t {
    /* JADX INFO: renamed from: a */
    p00.h getInterceptorsProfile();

    /* JADX INFO: renamed from: pl.gov.coi.common.network.t$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lpl/gov/coi/common/network/t$a;", "Lpl/gov/coi/common/network/t;", "Lp00/h;", "interceptorsProfile", "<init>", "(Lp00/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lp00/h;", "()Lp00/h;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Backend implements t {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final p00.h interceptorsProfile;

        public Backend(p00.h hVar) {
            this.interceptorsProfile = hVar;
        }

        @Override // pl.gov.coi.common.network.t
        /* JADX INFO: renamed from: a, reason: from getter */
        public p00.h getInterceptorsProfile() {
            return this.interceptorsProfile;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Backend) && fr.t.c(this.interceptorsProfile, ((Backend) other).interceptorsProfile);
        }

        public int hashCode() {
            return this.interceptorsProfile.hashCode();
        }

        public String toString() {
            return "Backend(interceptorsProfile=" + this.interceptorsProfile + ')';
        }

        public /* synthetic */ Backend(p00.h hVar, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? new p00.h.Internal(null, 1, null) : hVar);
        }
    }

    /* JADX INFO: renamed from: pl.gov.coi.common.network.t$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lpl/gov/coi/common/network/t$b;", "Lpl/gov/coi/common/network/t;", "Lp00/h;", "interceptorsProfile", "<init>", "(Lp00/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lp00/h;", "()Lp00/h;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NonCTRaw implements t {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final p00.h interceptorsProfile;

        public NonCTRaw(p00.h hVar) {
            this.interceptorsProfile = hVar;
        }

        @Override // pl.gov.coi.common.network.t
        /* JADX INFO: renamed from: a, reason: from getter */
        public p00.h getInterceptorsProfile() {
            return this.interceptorsProfile;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NonCTRaw) && fr.t.c(this.interceptorsProfile, ((NonCTRaw) other).interceptorsProfile);
        }

        public int hashCode() {
            return this.interceptorsProfile.hashCode();
        }

        public String toString() {
            return "NonCTRaw(interceptorsProfile=" + this.interceptorsProfile + ')';
        }

        public /* synthetic */ NonCTRaw(p00.h hVar, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? new p00.h.External(null, null, false, 3, null) : hVar);
        }
    }

    /* JADX INFO: renamed from: pl.gov.coi.common.network.t$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lpl/gov/coi/common/network/t$c;", "Lpl/gov/coi/common/network/t;", "Lp00/h;", "interceptorsProfile", "<init>", "(Lp00/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lp00/h;", "()Lp00/h;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Public implements t {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final p00.h interceptorsProfile;

        public Public(p00.h hVar) {
            this.interceptorsProfile = hVar;
        }

        @Override // pl.gov.coi.common.network.t
        /* JADX INFO: renamed from: a, reason: from getter */
        public p00.h getInterceptorsProfile() {
            return this.interceptorsProfile;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Public) && fr.t.c(this.interceptorsProfile, ((Public) other).interceptorsProfile);
        }

        public int hashCode() {
            return this.interceptorsProfile.hashCode();
        }

        public String toString() {
            return "Public(interceptorsProfile=" + this.interceptorsProfile + ')';
        }

        public /* synthetic */ Public(p00.h hVar, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? new p00.h.External(null, null, false, 7, null) : hVar);
        }
    }

    /* JADX INFO: renamed from: pl.gov.coi.common.network.t$d, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lpl/gov/coi/common/network/t$d;", "Lpl/gov/coi/common/network/t;", "Lp00/h;", "interceptorsProfile", "<init>", "(Lp00/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lp00/h;", "()Lp00/h;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SSE implements t {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final p00.h interceptorsProfile;

        public SSE(p00.h hVar) {
            this.interceptorsProfile = hVar;
        }

        @Override // pl.gov.coi.common.network.t
        /* JADX INFO: renamed from: a, reason: from getter */
        public p00.h getInterceptorsProfile() {
            return this.interceptorsProfile;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SSE) && fr.t.c(this.interceptorsProfile, ((SSE) other).interceptorsProfile);
        }

        public int hashCode() {
            return this.interceptorsProfile.hashCode();
        }

        public String toString() {
            return "SSE(interceptorsProfile=" + this.interceptorsProfile + ')';
        }

        public /* synthetic */ SSE(p00.h hVar, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? new p00.h.Internal(tv.a.EnumC5026a.BASIC) : hVar);
        }
    }
}
