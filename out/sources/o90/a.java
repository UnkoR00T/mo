package o90;

import cg0.SchoolCardDocument;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lo90/a;", "", "<init>", "()V", "Leg0/t;", "saveDocumentUC", "Leg0/d;", "deleteDocumentByIDUC", "Leg0/o;", "isDocumentAddedByIDUC", "Leg0/a;", "changeUserCertStatusUC", "Leg0/u;", "saveMultiDocumentSchemaUC", "Leg0/k;", "getSchoolCardUC", "Llf0/a;", "a", "(Leg0/t;Leg0/d;Leg0/o;Leg0/a;Leg0/u;Leg0/k;)Llf0/a;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f143371a = new a();

    /* JADX INFO: renamed from: o90.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JH\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b\f\u0010\rJ,\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00120\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0013\u0010\u0011J\u001c\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0016\u0010\u0011¨\u0006\u0017"}, d2 = {"o90/a$a", "Llf0/a;", "", "documentId", "parentDocumentId", "Lcf0/c;", "documentType", "documentScope", "documentSchema", "Ldx/i;", "Ldx/b;", "Loq/i0;", "d", "(Ljava/lang/String;Ljava/lang/String;Lcf0/c;Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "c", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "b", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "", "f", "h", "(Ltq/e;)Ljava/lang/Object;", "g", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C3552a implements lf0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ eg0.t f143372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ eg0.u f143373b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ eg0.d f143374c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ eg0.o f143375d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ eg0.a f143376e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ eg0.k f143377f;

        /* JADX INFO: renamed from: o90.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C3553a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f143378a;

            static {
                int[] iArr = new int[cf0.c.values().length];
                try {
                    iArr[cf0.c.JUNIOR_STUDENT_CARD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[cf0.c.DRIVING_LICENCE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[cf0.c.FAMILY_CARD.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[cf0.c.UUT_CARD.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[cf0.c.DISABLED_PERSON_IDENTIFICATION_CARD.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f143378a = iArr;
            }
        }

        /* JADX INFO: renamed from: o90.a$a$b */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f143379d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f143380e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f143381f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f143382g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f143383h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f143384j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f143385k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f143386l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f143387m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            /* synthetic */ Object f143388n;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f143390q;

            b(tq.e<? super b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f143388n = obj;
                this.f143390q |= PKIFailureInfo.systemUnavail;
                return C3552a.this.g(null, this);
            }
        }

        C3552a(eg0.t tVar, eg0.u uVar, eg0.d dVar, eg0.o oVar, eg0.a aVar, eg0.k kVar) {
            this.f143372a = tVar;
            this.f143373b = uVar;
            this.f143374c = dVar;
            this.f143375d = oVar;
            this.f143376e = aVar;
            this.f143377f = kVar;
        }

        @Override // lf0.a
        public Object b(String str, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) {
            return this.f143374c.c(new eg0.d.Params(str), eVar);
        }

        @Override // lf0.a
        public Object c(String str, String str2, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) {
            return this.f143373b.c(new eg0.u.Params(str, str2), eVar);
        }

        @Override // lf0.a
        public Object d(String str, String str2, cf0.c cVar, String str3, String str4, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) {
            vf0.d dVar;
            eg0.t tVar = this.f143372a;
            int i15 = C3553a.f143378a[cVar.ordinal()];
            if (i15 == 1) {
                dVar = vf0.d.SCHOOL_CARD;
            } else if (i15 == 2) {
                dVar = vf0.d.DRIVING_LICENCE;
            } else if (i15 == 3) {
                dVar = vf0.d.FAMILY_CARD;
            } else if (i15 == 4) {
                dVar = vf0.d.UUT_CARD;
            } else {
                if (i15 != 5) {
                    throw new oq.p();
                }
                dVar = vf0.d.DISABLED_PERSON_IDENTIFICATION_CARD;
            }
            return tVar.c(new eg0.t.Params(str, str2, dVar, str3, str4), eVar);
        }

        @Override // lf0.a
        public Object f(String str, tq.e<? super dx.i<? extends dx.b, Boolean>> eVar) {
            return this.f143375d.c(new eg0.o.Params(str), eVar);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x008e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:30:0x008f A[Catch: Exception -> 0x0039, c -> 0x003c, CancellationException -> 0x003f, TryCatch #3 {Exception -> 0x0039, blocks: (B:12:0x0035, B:27:0x0088, B:30:0x008f, B:32:0x0093, B:34:0x00ad, B:35:0x00b2, B:42:0x00bc, B:45:0x00ca), top: B:60:0x0021 }] */
        /* JADX WARN: Code duplicated, block: B:32:0x0093 A[Catch: Exception -> 0x0039, c -> 0x003c, CancellationException -> 0x003f, TryCatch #3 {Exception -> 0x0039, blocks: (B:12:0x0035, B:27:0x0088, B:30:0x008f, B:32:0x0093, B:34:0x00ad, B:35:0x00b2, B:42:0x00bc, B:45:0x00ca), top: B:60:0x0021 }] */
        /* JADX WARN: Code duplicated, block: B:34:0x00ad A[Catch: Exception -> 0x0039, c -> 0x003c, CancellationException -> 0x003f, TryCatch #3 {Exception -> 0x0039, blocks: (B:12:0x0035, B:27:0x0088, B:30:0x008f, B:32:0x0093, B:34:0x00ad, B:35:0x00b2, B:42:0x00bc, B:45:0x00ca), top: B:60:0x0021 }] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r7v2, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v9 */
        @Override // lf0.a
        public Object g(String str, tq.e<? super dx.i<? extends dx.b, String>> eVar) throws Throwable {
            b bVar;
            Object objB;
            dx.i iVar;
            if (eVar instanceof b) {
                bVar = (b) eVar;
                int i15 = bVar.f143390q;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    bVar.f143390q = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    bVar = new b(eVar);
                }
            } else {
                bVar = new b(eVar);
            }
            Object objC = bVar.f143388n;
            Object objE = uq.b.e();
            int i16 = bVar.f143390q;
            try {
                try {
                    if (i16 != 0) {
                        if (i16 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        try {
                            oq.u.b(objC);
                            iVar = (dx.i) objC;
                            if (iVar instanceof dx.i.Left) {
                                return iVar;
                            }
                            if (iVar instanceof dx.i.Right) {
                                return new dx.i.Right(((SchoolCardDocument) ((dx.i.Right) iVar).b()).getScopeData().getContainer().getTechnicalId());
                            }
                            throw new oq.p();
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        }
                    }
                    oq.u.b(objC);
                    eg0.k kVar = this.f143377f;
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        eg0.k.Params params = new eg0.k.Params(str);
                        bVar.f143379d = vq.j.a(str);
                        bVar.f143380e = jVarA;
                        bVar.f143381f = vq.j.a(aVar);
                        bVar.f143382g = vq.j.a(aVar);
                        bVar.f143383h = 0;
                        bVar.f143384j = 0;
                        bVar.f143385k = 0;
                        bVar.f143386l = 0;
                        bVar.f143387m = 0;
                        bVar.f143390q = 1;
                        objC = kVar.c(params, bVar);
                        if (objC == objE) {
                            return objE;
                        }
                        iVar = (dx.i) objC;
                        if (iVar instanceof dx.i.Left) {
                            return iVar;
                        }
                        if (iVar instanceof dx.i.Right) {
                            return new dx.i.Right(((SchoolCardDocument) ((dx.i.Right) iVar).b()).getScopeData().getContainer().getTechnicalId());
                        }
                        throw new oq.p();
                    } catch (ex.c e17) {
                        e = e17;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e18) {
                        throw e18;
                    } catch (Exception e19) {
                        e = e19;
                        str = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(str));
                        dx.i iVarA = str.a(e);
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
                } catch (Exception e25) {
                    e = e25;
                }
            } catch (CancellationException e26) {
                throw e26;
            }
        }

        @Override // lf0.a
        public Object h(tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) {
            return this.f143376e.c(new eg0.a.Params(wf0.a.ACTIVE), eVar);
        }
    }

    private a() {
    }

    public final lf0.a a(eg0.t saveDocumentUC, eg0.d deleteDocumentByIDUC, eg0.o isDocumentAddedByIDUC, eg0.a changeUserCertStatusUC, eg0.u saveMultiDocumentSchemaUC, eg0.k getSchoolCardUC) {
        return new C3552a(saveDocumentUC, saveMultiDocumentSchemaUC, deleteDocumentByIDUC, isDocumentAddedByIDUC, changeUserCertStatusUC, getSchoolCardUC);
    }
}
