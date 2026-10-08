package pc4;

import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lpc4/j3;", "", "<init>", "()V", "Lc54/b;", "isFeatureEnabledUseCase", "Lq34/k1;", "isDocumentAddedUseCase", "Lk24/k;", "isDocumentAddedByIdUC", "Lq34/b1;", "getSavedDocumentNameUC", "Liv3/a;", "a", "(Lc54/b;Lq34/k1;Lk24/k;Lq34/b1;)Liv3/a;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j3 f155038a = new j3();

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J.\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"pc4/j3$a", "Liv3/a;", "", "documentId", "Lrq0/b;", "documentType", "Ldx/i;", "Ldx/b;", "", "a", "(Ljava/lang/String;Lrq0/b;Ltq/e;)Ljava/lang/Object;", "b", "(Lrq0/b;Ltq/e;)Ljava/lang/Object;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements iv3.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c54.b f155039a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k24.k f155040b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q34.k1 f155041c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ q34.b1 f155042d;

        /* JADX INFO: renamed from: pc4.j3$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3843a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f155043d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f155044e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f155045f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f155046g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f155047h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f155048j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f155049k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f155050l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f155051m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            /* synthetic */ Object f155052n;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f155054q;

            C3843a(tq.e<? super C3843a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155052n = obj;
                this.f155054q |= PKIFailureInfo.systemUnavail;
                return a.this.b(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f155055d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f155056e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f155057f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f155058g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f155059h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f155060j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f155061k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f155062l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f155063m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f155064n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f155065p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            /* synthetic */ Object f155066q;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f155068s;

            b(tq.e<? super b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155066q = obj;
                this.f155068s |= PKIFailureInfo.systemUnavail;
                return a.this.a(null, null, this);
            }
        }

        a(c54.b bVar, k24.k kVar, q34.k1 k1Var, q34.b1 b1Var) {
            this.f155039a = bVar;
            this.f155040b = kVar;
            this.f155041c = k1Var;
            this.f155042d = b1Var;
        }

        /* JADX WARN: Code duplicated, block: B:67:0x016e  */
        /* JADX WARN: Code duplicated, block: B:70:0x017f  */
        /* JADX WARN: Code duplicated, block: B:71:0x018d  */
        /* JADX WARN: Code duplicated, block: B:73:0x0191  */
        /* JADX WARN: Code duplicated, block: B:76:0x019d  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.lang.String] */
        /* JADX WARN: Type inference failed for: r11v2, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v30 */
        /* JADX WARN: Type inference failed for: r11v9 */
        @Override // iv3.a
        public Object a(String str, rq0.b bVar, tq.e<? super dx.i<? extends dx.b, Boolean>> eVar) throws Throwable {
            b bVar2;
            String message;
            dx.i iVarA;
            Object objB;
            dx.j<dx.b> jVar;
            dx.j<dx.b> jVar2;
            ex.b bVar3;
            boolean zBooleanValue;
            if (eVar instanceof b) {
                bVar2 = (b) eVar;
                int i15 = bVar2.f155068s;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    bVar2.f155068s = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    bVar2 = new b(eVar);
                }
            } else {
                bVar2 = new b(eVar);
            }
            Object objC = bVar2.f155066q;
            Object objE = uq.b.e();
            int i16 = bVar2.f155068s;
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(objC);
                        c54.b bVar4 = this.f155039a;
                        k24.k kVar = this.f155040b;
                        q34.k1 k1Var = this.f155041c;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            boolean zBooleanValue2 = bVar4.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
                            if (zBooleanValue2) {
                                if (str == 0) {
                                    aVar.b(new dx.b.Generic(new IllegalArgumentException("Document id is null, but expected not null when containers feature is enabled")));
                                    throw new oq.g();
                                }
                                k24.k.Params params = new k24.k.Params(str);
                                bVar2.f155055d = vq.j.a(str);
                                bVar2.f155056e = vq.j.a(bVar);
                                bVar2.f155057f = jVarA;
                                bVar2.f155058g = vq.j.a(aVar);
                                bVar2.f155059h = vq.j.a(aVar);
                                bVar2.f155060j = aVar;
                                bVar2.f155061k = 0;
                                bVar2.f155062l = 0;
                                bVar2.f155063m = 0;
                                bVar2.f155064n = 0;
                                bVar2.f155065p = 0;
                                bVar2.f155068s = 1;
                                objC = kVar.c(params, bVar2);
                                if (objC != objE) {
                                    jVar2 = jVarA;
                                    bVar3 = aVar;
                                    zBooleanValue = ((Boolean) bVar3.a((dx.i) objC)).booleanValue();
                                }
                            } else {
                                if (zBooleanValue2) {
                                    throw new oq.p();
                                }
                                q34.k1.Params params2 = new q34.k1.Params(bVar);
                                bVar2.f155055d = vq.j.a(str);
                                bVar2.f155056e = vq.j.a(bVar);
                                bVar2.f155057f = jVarA;
                                bVar2.f155058g = vq.j.a(aVar);
                                bVar2.f155059h = vq.j.a(aVar);
                                bVar2.f155061k = 0;
                                bVar2.f155062l = 0;
                                bVar2.f155063m = 0;
                                bVar2.f155064n = 0;
                                bVar2.f155065p = 0;
                                bVar2.f155068s = 2;
                                objC = k1Var.c(params2, bVar2);
                                if (objC != objE) {
                                    jVar = jVarA;
                                    jVar2 = jVar;
                                    zBooleanValue = ((Boolean) objC).booleanValue();
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
                            str = jVarA;
                            px.f fVar = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(str));
                            iVarA = str.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (iVarA instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    }
                    if (i16 == 1) {
                        bVar3 = (ex.b) bVar2.f155060j;
                        jVar2 = (dx.j) bVar2.f155057f;
                        try {
                            oq.u.b(objC);
                            zBooleanValue = ((Boolean) bVar3.a((dx.i) objC)).booleanValue();
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        } catch (Exception e25) {
                            dx.j<dx.b> jVar3 = jVar2;
                            e = e25;
                            str = jVar3;
                            px.f fVar2 = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar2.d(message, e, px.c.a(str));
                            iVarA = str.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (iVarA instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } else {
                        if (i16 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        jVar = (dx.j) bVar2.f155057f;
                        try {
                            oq.u.b(objC);
                            jVar2 = jVar;
                            zBooleanValue = ((Boolean) objC).booleanValue();
                        } catch (ex.c e26) {
                            e = e26;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e27) {
                            throw e27;
                        }
                    }
                    return new dx.i.Right(vq.b.a(zBooleanValue));
                } catch (CancellationException e28) {
                    throw e28;
                }
            } catch (Exception e29) {
                e = e29;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, rq0.b] */
        /* JADX WARN: Type inference failed for: r7v2, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v9 */
        @Override // iv3.a
        public Object b(rq0.b bVar, tq.e<? super dx.i<? extends dx.b, String>> eVar) throws Throwable {
            C3843a c3843a;
            Object objB;
            if (eVar instanceof C3843a) {
                c3843a = (C3843a) eVar;
                int i15 = c3843a.f155054q;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    c3843a.f155054q = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    c3843a = new C3843a(eVar);
                }
            } else {
                c3843a = new C3843a(eVar);
            }
            Object objC = c3843a.f155052n;
            Object objE = uq.b.e();
            int i16 = c3843a.f155054q;
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(objC);
                        q34.b1 b1Var = this.f155042d;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            q34.b1.Params params = new q34.b1.Params(bVar);
                            c3843a.f155043d = vq.j.a(bVar);
                            c3843a.f155044e = jVarA;
                            c3843a.f155045f = vq.j.a(aVar);
                            c3843a.f155046g = vq.j.a(aVar);
                            c3843a.f155047h = 0;
                            c3843a.f155048j = 0;
                            c3843a.f155049k = 0;
                            c3843a.f155050l = 0;
                            c3843a.f155051m = 0;
                            c3843a.f155054q = 1;
                            objC = b1Var.c(params, c3843a);
                            if (objC == objE) {
                                return objE;
                            }
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            bVar = jVarA;
                            px.f fVar = px.f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(bVar));
                            dx.i iVarA = bVar.a(e);
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
                    } else {
                        if (i16 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        try {
                            oq.u.b(objC);
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        }
                    }
                    return new dx.i.Right((String) objC);
                } catch (Exception e25) {
                    e = e25;
                }
            } catch (CancellationException e26) {
                throw e26;
            }
        }
    }

    private j3() {
    }

    public final iv3.a a(c54.b isFeatureEnabledUseCase, q34.k1 isDocumentAddedUseCase, k24.k isDocumentAddedByIdUC, q34.b1 getSavedDocumentNameUC) {
        return new a(isFeatureEnabledUseCase, isDocumentAddedByIdUC, isDocumentAddedUseCase, getSavedDocumentNameUC);
    }
}
