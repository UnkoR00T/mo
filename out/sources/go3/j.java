package go3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lgo3/j;", "Lgz/b;", "Lgo3/j$a;", "Lrq0/b;", "<init>", "()V", "params", "d", "(Lgo3/j$a;Ltq/e;)Ljava/lang/Object;", "a", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements gz.b<Params, rq0.b> {

    /* JADX INFO: renamed from: go3.j$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lgo3/j$a;", "Lgz/b$a;", "Lk34/a0;", "scope", "<init>", "(Lk34/a0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lk34/a0;", "()Lk34/a0;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final k34.a0 scope;

        public Params(k34.a0 a0Var) {
            this.scope = a0Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final k34.a0 getScope() {
            return this.scope;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && fr.t.c(this.scope, ((Params) other).scope);
        }

        public int hashCode() {
            return this.scope.hashCode();
        }

        public String toString() {
            return "Params(scope=" + this.scope + ')';
        }
    }

    public Object d(Params params, tq.e<? super rq0.b> eVar) {
        k34.a0 scope = params.getScope();
        if (fr.t.c(scope, k34.a0.m.f107878a) || fr.t.c(scope, k34.a0.n.f107880a) || fr.t.c(scope, k34.a0.o.f107882a) || fr.t.c(scope, k34.a0.p.f107884a) || fr.t.c(scope, k34.a0.q.f107886a) || fr.t.c(scope, k34.a0.r.f107888a) || fr.t.c(scope, k34.a0.s.f107890a) || fr.t.c(scope, k34.a0.t.f107892a) || fr.t.c(scope, k34.a0.u.f107894a) || fr.t.c(scope, k34.a0.v.f107896a)) {
            return rq0.b.d.ID_CARD;
        }
        if (fr.t.c(scope, k34.a0.C2570a0.f107847a) || fr.t.c(scope, k34.a0.b0.f107850a)) {
            return rq0.b.d.STUDENT_CARD;
        }
        if (fr.t.c(scope, k34.a0.w.f107898a) || fr.t.c(scope, k34.a0.x.f107900a) || fr.t.c(scope, k34.a0.y.f107902a)) {
            return rq0.b.d.DIIA_REFUGEE_CARD;
        }
        if (fr.t.c(scope, k34.a0.z.f107904a)) {
            return rq0.b.d.DRIVING_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.s0.f107891a)) {
            return rq0.b.d.PENSIONER_CARD;
        }
        if (fr.t.c(scope, k34.a0.h1.f107869a)) {
            return rq0.b.e.ZDUNSKOWOLSKA_SENIOR_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.g1.f107866a)) {
            return rq0.b.e.ZDUNSKOWOLSKA_RESIDENT_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.f1.f107863a)) {
            return rq0.b.e.ZDUNSKOWOLSKA_FAMILY_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.y0.f107903a)) {
            return rq0.b.e.RASKA_SENIOR_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.p0.f107885a)) {
            return rq0.b.e.OLAWA_RESIDENT_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.o0.f107883a)) {
            return rq0.b.e.OLAWA_FAMILY_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.q0.f107887a)) {
            return rq0.b.e.OLAWA_SENIOR_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.a1.f107848a)) {
            return rq0.b.e.SUCHY_LAS_FAMILY_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.i0.f107871a)) {
            return rq0.b.e.MIEJSKA_AUGUSTOW_TOURIST_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.c.f107852a)) {
            return rq0.b.e.CHELM_FAMILY_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.e.f107858a)) {
            return rq0.b.e.CHELM_SENIOR_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.d.f107855a)) {
            return rq0.b.e.CHELM_RESIDENT_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.g0.f107865a)) {
            return rq0.b.e.LODZ_SENIOR_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.f0.f107862a)) {
            return rq0.b.e.LODZ_FAMILY_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.i.f107870a)) {
            return rq0.b.d.FAMILY_CARD;
        }
        if (fr.t.c(scope, k34.a0.a.f107846a)) {
            return rq0.b.d.ADVOCATE_CARD;
        }
        if (fr.t.c(scope, k34.a0.x0.f107901a)) {
            return rq0.b.d.RAILWAY_CARD;
        }
        if (fr.t.c(scope, k34.a0.f.f107861a)) {
            return rq0.b.d.DEPUTY_CARD;
        }
        if (fr.t.c(scope, k34.a0.z0.f107905a)) {
            return rq0.b.e.SENATOR_CARD;
        }
        if (fr.t.c(scope, k34.a0.t0.f107893a)) {
            return rq0.b.e.PZPN_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.k.f107874a)) {
            return rq0.b.e.GIZYCKA_RESIDENT_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.v0.f107897a)) {
            return rq0.b.e.RACIBORSKA_RESIDENT_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.w0.f107899a)) {
            return rq0.b.e.RACIBORSKA_SENIOR_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.u0.f107895a)) {
            return rq0.b.e.RACIBORSKA_FAMILY_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.n0.f107881a)) {
            return rq0.b.d.NURSE_CARD;
        }
        if (fr.t.c(scope, k34.a0.h0.f107868a)) {
            return rq0.b.d.MIDWIFE_CARD;
        }
        if (fr.t.c(scope, k34.a0.c1.f107854a)) {
            return rq0.b.e.WROCLAWSKA_SENIOR_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.d0.f107856a)) {
            return rq0.b.e.KOBYLKA_RESIDENT_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.k0.f107875a)) {
            return rq0.b.e.MIEKINIA_SENIOR_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.j0.f107873a)) {
            return rq0.b.e.MIEKINIA_FAMILY_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.b1.f107851a)) {
            return rq0.b.e.TOPR_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.l0.f107877a)) {
            return rq0.b.e.MAZOVIA_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.l.f107876a)) {
            return rq0.b.e.GENERAL_COUNSEL_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.r0.f107889a)) {
            return rq0.b.e.OLECKO_RESIDENT_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.b.f107849a)) {
            return rq0.b.e.BYDGOSZCZ_FAMILY_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.e1.f107860a)) {
            return rq0.b.e.WODZISLAW_FAMILY_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.m0.f107879a)) {
            return rq0.b.e.MICHALOWICE_RESIDENT_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.e0.f107859a)) {
            return rq0.b.e.KOLEJE_DOLNOSLASKIE_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.d1.f107857a)) {
            return rq0.b.e.WISLA_RESIDENT_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.c0.f107853a)) {
            return rq0.b.e.JASTRZEBIA_GORA_RESIDENT_LICENCE;
        }
        if (fr.t.c(scope, k34.a0.j.f107872a)) {
            return rq0.b.e.FIREFIGHTER_OSP_LICENCE;
        }
        if (scope instanceof k34.a0.DynamicDocument) {
            return ((k34.a0.DynamicDocument) params.getScope()).getDocumentType();
        }
        if (scope instanceof k34.a0.DynamicMultiDocument) {
            return ((k34.a0.DynamicMultiDocument) params.getScope()).getDocumentType();
        }
        throw new oq.p();
    }
}
