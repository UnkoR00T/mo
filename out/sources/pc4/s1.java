package pc4;

import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lpc4/s1;", "", "<init>", "()V", "Lg34/c;", "identityManager", "Lc54/b;", "isFeatureEnabledUseCase", "Lk24/m;", "revokeMainCertificateUC", "Lq34/m1;", "isMostImportantUserDocumentUseCase", "Lw24/w1;", "hasMainActiveCertificateWithSerialNumberUC", "Lo11/a;", "b", "(Lg34/c;Lc54/b;Lk24/m;Lq34/m1;Lw24/w1;)Lo11/a;", "La84/b;", "clearNotificationsDeviceTokenUseCase", "Lo11/b;", "a", "(La84/b;)Lo11/b;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s1 f155878a = new s1();

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"pc4/s1$a", "Lo11/b;", "Loq/i0;", "a", "(Ltq/e;)Ljava/lang/Object;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements o11.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a84.b f155879a;

        a(a84.b bVar) {
            this.f155879a = bVar;
        }

        @Override // o11.b
        public Object a(tq.e<? super oq.i0> eVar) throws Throwable {
            Object objA = this.f155879a.a(gz.b.a.C1792a.f78542a, eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\"\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"pc4/s1$b", "Lo11/a;", "Ldx/i;", "Ldx/b;", "Loq/i0;", "e", "(Ltq/e;)Ljava/lang/Object;", "Lrq0/b;", "documentType", "Liy/b0;", "serialNumber", "", "f", "(Lrq0/b;Liy/b0;Ltq/e;)Ljava/lang/Object;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements o11.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c54.b f155880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k24.m f155881b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g34.c f155882c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ w24.w1 f155883d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ q34.m1 f155884e;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f155885d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f155886e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f155887f;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f155889h;

            a(tq.e<? super a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155887f = obj;
                this.f155889h |= PKIFailureInfo.systemUnavail;
                return b.this.f(null, null, this);
            }
        }

        /* JADX INFO: renamed from: pc4.s1$b$b, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3865b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f155890d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f155891e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f155892f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f155893g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f155894h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f155895j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f155896k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f155897l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            /* synthetic */ Object f155898m;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f155900p;

            C3865b(tq.e<? super C3865b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155898m = obj;
                this.f155900p |= PKIFailureInfo.systemUnavail;
                return b.this.e(this);
            }
        }

        b(c54.b bVar, k24.m mVar, g34.c cVar, w24.w1 w1Var, q34.m1 m1Var) {
            this.f155880a = bVar;
            this.f155881b = mVar;
            this.f155882c = cVar;
            this.f155883d = w1Var;
            this.f155884e = m1Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [pc4.s1$b$b, tq.e] */
        /* JADX WARN: Type inference failed for: r0v21 */
        /* JADX WARN: Type inference failed for: r0v22 */
        /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v9 */
        /* JADX WARN: Type inference failed for: r5v0, types: [g34.c] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // o11.a
        public Object e(tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            ?? c3865b;
            Object objB;
            if (eVar instanceof C3865b) {
                C3865b c3865b2 = (C3865b) eVar;
                int i15 = c3865b2.f155900p;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    c3865b2.f155900p = i15 - PKIFailureInfo.systemUnavail;
                    c3865b = c3865b2;
                } else {
                    c3865b = new C3865b(eVar);
                }
            } else {
                c3865b = new C3865b(eVar);
            }
            Object obj = c3865b.f155898m;
            Object objE = uq.b.e();
            int i16 = c3865b.f155900p;
            try {
                try {
                    try {
                        if (i16 == 0) {
                            oq.u.b(obj);
                            c54.b bVar = this.f155880a;
                            k24.m mVar = this.f155881b;
                            ?? r15 = this.f155882c;
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            try {
                                ex.a aVar = new ex.a();
                                boolean zBooleanValue = bVar.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                                if (zBooleanValue) {
                                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                                    c3865b.f155895j = jVarA;
                                    c3865b.f155896k = vq.j.a(aVar);
                                    c3865b.f155897l = vq.j.a(aVar);
                                    c3865b.f155890d = 0;
                                    c3865b.f155891e = 0;
                                    c3865b.f155892f = 0;
                                    c3865b.f155893g = 0;
                                    c3865b.f155894h = 0;
                                    c3865b.f155900p = 1;
                                    if (mVar.c(c1792a, c3865b) == objE) {
                                    }
                                } else {
                                    if (zBooleanValue) {
                                        throw new oq.p();
                                    }
                                    c3865b.f155895j = jVarA;
                                    c3865b.f155896k = vq.j.a(aVar);
                                    c3865b.f155897l = vq.j.a(aVar);
                                    c3865b.f155890d = 0;
                                    c3865b.f155891e = 0;
                                    c3865b.f155892f = 0;
                                    c3865b.f155893g = 0;
                                    c3865b.f155894h = 0;
                                    c3865b.f155900p = 2;
                                    if (r15.k(c3865b) != objE) {
                                        oq.i0 i0Var = oq.i0.f148189a;
                                    }
                                }
                                return objE;
                            } catch (ex.c e15) {
                                e = e15;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e16) {
                                throw e16;
                            } catch (Exception e17) {
                                e = e17;
                                c3865b = jVarA;
                                px.f fVar = px.f.f163100a;
                                String message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar.d(message, e, px.c.a(c3865b));
                                dx.i iVarA = c3865b.a(e);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (!(iVarA instanceof dx.i.Right)) {
                                        throw new oq.p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                        }
                        if (i16 == 1) {
                            oq.u.b(obj);
                        } else {
                            if (i16 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            oq.u.b(obj);
                            oq.i0 i0Var2 = oq.i0.f148189a;
                        }
                        return new dx.i.Right(oq.i0.f148189a);
                    } catch (CancellationException e18) {
                        throw e18;
                    }
                } catch (Exception e19) {
                    e = e19;
                }
            } catch (ex.c e25) {
                e = e25;
            } catch (CancellationException e26) {
                throw e26;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00c2, code lost:
        
            if (r9 == r1) goto L63;
         */
        @Override // o11.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object f(rq0.b r7, iy.b0 r8, tq.e<? super java.lang.Boolean> r9) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 297
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: pc4.s1.b.f(rq0.b, iy.b0, tq.e):java.lang.Object");
        }
    }

    private s1() {
    }

    public final o11.b a(a84.b clearNotificationsDeviceTokenUseCase) {
        return new a(clearNotificationsDeviceTokenUseCase);
    }

    public final o11.a b(g34.c identityManager, c54.b isFeatureEnabledUseCase, k24.m revokeMainCertificateUC, q34.m1 isMostImportantUserDocumentUseCase, w24.w1 hasMainActiveCertificateWithSerialNumberUC) {
        return new b(isFeatureEnabledUseCase, revokeMainCertificateUC, identityManager, hasMainActiveCertificateWithSerialNumberUC, isMostImportantUserDocumentUseCase);
    }
}
