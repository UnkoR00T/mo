package vv2;

import al0.BEGenerateXmlResponse;
import al0.b0;
import al0.g;
import dx.i;
import er.p;
import fr.t;
import j44.Access;
import ml0.d;
import ml0.e;
import oq.i0;
import p071kotlin.Metadata;
import vq.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001:\u0001\u0011B!\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lvv2/a;", "Lgz/b;", "Lvv2/a$a;", "Ldx/i;", "Lk44/a;", "Lal0/m;", "Lml0/d;", "generateAdultXmlUC", "Lml0/e;", "generateUnderLegalGuardianshipXmlUC", "Ll44/a;", "callActionWithEdorAuthTokenUC", "<init>", "(Lml0/d;Lml0/e;Ll44/a;)V", "params", "f", "(Lvv2/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lml0/d;", "b", "Lml0/e;", "c", "Ll44/a;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.b<Params, i<? extends k44.a, ? extends BEGenerateXmlResponse>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d generateAdultXmlUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e generateUnderLegalGuardianshipXmlUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l44.a callActionWithEdorAuthTokenUC;

    /* JADX INFO: renamed from: vv2.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lvv2/a$a;", "Lgz/b$a;", "Lal0/b0;", "data", "Lal0/g;", "ownerWithAge", "<init>", "(Lal0/b0;Lal0/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lal0/b0;", "()Lal0/b0;", "b", "Lal0/g;", "getOwnerWithAge", "()Lal0/g;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 data;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final g ownerWithAge;

        public Params(b0 b0Var, g gVar) {
            this.data = b0Var;
            this.ownerWithAge = gVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b0 getData() {
            return this.data;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.data, params.data) && t.c(this.ownerWithAge, params.ownerWithAge);
        }

        public int hashCode() {
            return (this.data.hashCode() * 31) + this.ownerWithAge.hashCode();
        }

        public String toString() {
            return "Params(data=" + this.data + ", ownerWithAge=" + this.ownerWithAge + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lj44/f;", "token", "Ldx/i;", "Ldx/b;", "Lal0/m;", "<anonymous>", "(Lj44/f;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class b extends k implements p<Access, tq.e<? super i<? extends dx.b, ? extends BEGenerateXmlResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f208492e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f208493f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f208494g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Params f208495h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ a f208496j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Params params, a aVar, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f208495h = params;
            this.f208496j = aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x006a, code lost:
        
            if (r8 == r1) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0099, code lost:
        
            if (r8 == r1) goto L21;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f208494g
                j44.f r0 = (j44.Access) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r7.f208493f
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L2b
                if (r2 == r4) goto L23
                if (r2 != r3) goto L1b
                java.lang.Object r0 = r7.f208492e
                iy.b0 r0 = (iy.b0) r0
                oq.u.b(r8)
                goto L9c
            L1b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L23:
                java.lang.Object r0 = r7.f208492e
                iy.b0 r0 = (iy.b0) r0
                oq.u.b(r8)
                goto L6d
            L2b:
                oq.u.b(r8)
                java.lang.String r8 = r0.getValue()
                iy.b0 r8 = iy.c0.g(r8)
                iy.b0 r8 = al0.a.a(r8)
                vv2.a$a r2 = r7.f208495h
                al0.b0 r2 = r2.getData()
                boolean r5 = r2 instanceof al0.Adult
                r6 = 0
                if (r5 == 0) goto L70
                vv2.a r2 = r7.f208496j
                ml0.d r2 = vv2.a.d(r2)
                ml0.d$a r3 = new ml0.d$a
                vv2.a$a r5 = r7.f208495h
                al0.b0 r5 = r5.getData()
                al0.d r5 = (al0.Adult) r5
                r3.<init>(r8, r5, r6)
                java.lang.Object r0 = vq.j.a(r0)
                r7.f208494g = r0
                java.lang.Object r8 = vq.j.a(r8)
                r7.f208492e = r8
                r7.f208493f = r4
                java.lang.Object r8 = r2.c(r3, r7)
                if (r8 != r1) goto L6d
                goto L9b
            L6d:
                dx.i r8 = (dx.i) r8
                return r8
            L70:
                boolean r2 = r2 instanceof al0.x0
                if (r2 == 0) goto L9f
                vv2.a r2 = r7.f208496j
                ml0.e r2 = vv2.a.e(r2)
                ml0.e$a r4 = new ml0.e$a
                vv2.a$a r5 = r7.f208495h
                al0.b0 r5 = r5.getData()
                al0.x0 r5 = (al0.x0) r5
                r4.<init>(r8, r5, r6)
                java.lang.Object r0 = vq.j.a(r0)
                r7.f208494g = r0
                java.lang.Object r8 = vq.j.a(r8)
                r7.f208492e = r8
                r7.f208493f = r3
                java.lang.Object r8 = r2.c(r4, r7)
                if (r8 != r1) goto L9c
            L9b:
                return r1
            L9c:
                dx.i r8 = (dx.i) r8
                return r8
            L9f:
                oq.p r8 = new oq.p
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: vv2.a.b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(Access access, tq.e<? super i<? extends dx.b, BEGenerateXmlResponse>> eVar) {
            return ((b) v(access, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            b bVar = new b(this.f208495h, this.f208496j, eVar);
            bVar.f208494g = obj;
            return bVar;
        }
    }

    public a(d dVar, e eVar, l44.a aVar) {
        this.generateAdultXmlUC = dVar;
        this.generateUnderLegalGuardianshipXmlUC = eVar;
        this.callActionWithEdorAuthTokenUC = aVar;
    }

    public Object f(Params params, tq.e<? super i<? extends k44.a, BEGenerateXmlResponse>> eVar) {
        return this.callActionWithEdorAuthTokenUC.a(new b(params, this, null), eVar);
    }
}
