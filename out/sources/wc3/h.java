package wc3;

import fr.t;
import java.util.concurrent.CancellationException;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import uc3.PassportsData;
import vq.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\u0012\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lwc3/h;", "", "Lwc3/h$a;", "Loq/i0;", "Lwc3/e;", "getPassportUC", "Lvc3/a;", "passportStorageRepository", "Ltc3/b;", "userDataDocumentsInteractor", "<init>", "(Lwc3/e;Lvc3/a;Ltc3/b;)V", "Luc3/i;", "data", "Ldx/i;", "Ldx/b;", "f", "(Luc3/i;Ltq/e;)Ljava/lang/Object;", "params", "e", "(Lwc3/h$a;Ltq/e;)Ljava/lang/Object;", "a", "Lwc3/e;", "b", "Lvc3/a;", "c", "Ltc3/b;", "userdata_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e getPassportUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final vc3.a passportStorageRepository;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final tc3.b userDataDocumentsInteractor;

    /* JADX INFO: renamed from: wc3.h$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lwc3/h$a;", "Lgz/b$a;", "Luc3/i;", "data", "<init>", "(Luc3/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Luc3/i;", "()Luc3/i;", "userdata_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final PassportsData data;

        public Params(PassportsData passportsData) {
            this.data = passportsData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final PassportsData getData() {
            return this.data;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.data, ((Params) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "Params(data=" + this.data + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f212118d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f212119e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f212120f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f212121g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f212122h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f212123j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f212125l;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f212123j = obj;
            this.f212125l |= PKIFailureInfo.systemUnavail;
            return h.this.e(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f212126d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f212127e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f212128f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f212129g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f212130h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f212131j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f212132k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f212133l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f212134m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f212135n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f212136p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f212137q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f212138r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f212139s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f212141v;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f212139s = obj;
            this.f212141v |= PKIFailureInfo.systemUnavail;
            return h.this.f(null, this);
        }
    }

    public h(e eVar, vc3.a aVar, tc3.b bVar) {
        this.getPassportUC = eVar;
        this.passportStorageRepository = aVar;
        this.userDataDocumentsInteractor = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:57:0x012b  */
    /* JADX WARN: Code duplicated, block: B:58:0x012c A[Catch: Exception -> 0x0080, c -> 0x0084, CancellationException -> 0x0088, TryCatch #7 {c -> 0x0084, CancellationException -> 0x0088, Exception -> 0x0080, blocks: (B:25:0x007b, B:55:0x0125, B:58:0x012c, B:60:0x0130, B:68:0x0180, B:69:0x0185), top: B:92:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0130 A[Catch: Exception -> 0x0080, c -> 0x0084, CancellationException -> 0x0088, TRY_LEAVE, TryCatch #7 {c -> 0x0084, CancellationException -> 0x0088, Exception -> 0x0080, blocks: (B:25:0x007b, B:55:0x0125, B:58:0x012c, B:60:0x0130, B:68:0x0180, B:69:0x0185), top: B:92:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0173  */
    /* JADX WARN: Code duplicated, block: B:68:0x0180 A[Catch: Exception -> 0x0080, c -> 0x0084, CancellationException -> 0x0088, TRY_ENTER, TryCatch #7 {c -> 0x0084, CancellationException -> 0x0088, Exception -> 0x0080, blocks: (B:25:0x007b, B:55:0x0125, B:58:0x012c, B:60:0x0130, B:68:0x0180, B:69:0x0185), top: B:92:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:76:0x019d  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:85:0x01cd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    public final Object f(PassportsData passportsData, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        c cVar;
        String message;
        dx.i iVarA;
        Object objB;
        ex.b aVar;
        PassportsData passportsData2;
        Object obj;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        ex.b bVar;
        dx.i iVar;
        Object obj2;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i25 = cVar.f212141v;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f212141v = i25 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objA = cVar.f212139s;
        ?? E = uq.b.e();
        int i26 = cVar.f212141v;
        try {
            try {
                try {
                    if (i26 == 0) {
                        u.b(objA);
                        objA = xw.c.f221622a.a();
                        try {
                            aVar = new ex.a();
                            if (this.userDataDocumentsInteractor.a()) {
                                vc3.a aVar2 = this.passportStorageRepository;
                                cVar.f212126d = j.a(passportsData);
                                cVar.f212127e = objA;
                                cVar.f212128f = j.a(aVar);
                                cVar.f212129g = j.a(aVar);
                                cVar.f212132k = 0;
                                cVar.f212133l = 0;
                                cVar.f212134m = 0;
                                cVar.f212135n = 0;
                                cVar.f212136p = 0;
                                cVar.f212141v = 1;
                                Object objD = aVar2.d(passportsData, cVar);
                                if (objD != E) {
                                    objA = objD;
                                }
                            } else {
                                vc3.a aVar3 = this.passportStorageRepository;
                                cVar.f212126d = j.a(passportsData);
                                cVar.f212127e = objA;
                                cVar.f212128f = j.a(aVar);
                                cVar.f212129g = j.a(aVar);
                                cVar.f212132k = 0;
                                cVar.f212133l = 0;
                                cVar.f212134m = 0;
                                cVar.f212135n = 0;
                                cVar.f212136p = 0;
                                cVar.f212141v = 2;
                                Object objA2 = aVar3.a(passportsData, cVar);
                                if (objA2 != E) {
                                    passportsData2 = passportsData;
                                    obj = objA;
                                    objA = objA2;
                                    i15 = 0;
                                    i16 = 0;
                                    i17 = 0;
                                    i18 = 0;
                                    i19 = 0;
                                    bVar = aVar;
                                    iVar = (dx.i) objA;
                                    if (!(iVar instanceof dx.i.Left)) {
                                        if (iVar instanceof dx.i.Right) {
                                            throw new p();
                                        }
                                        byte[] bArr = (byte[]) ((dx.i.Right) iVar).b();
                                        tc3.b bVar2 = this.userDataDocumentsInteractor;
                                        cVar.f212126d = j.a(passportsData2);
                                        cVar.f212127e = obj;
                                        cVar.f212128f = j.a(bVar);
                                        cVar.f212129g = j.a(aVar);
                                        cVar.f212130h = j.a(iVar);
                                        cVar.f212131j = j.a(bArr);
                                        cVar.f212132k = i19;
                                        cVar.f212133l = i18;
                                        cVar.f212134m = i17;
                                        cVar.f212135n = i16;
                                        cVar.f212136p = i15;
                                        cVar.f212137q = 0;
                                        cVar.f212138r = 0;
                                        cVar.f212141v = 3;
                                        objA = bVar2.f(bArr, cVar);
                                        if (objA != E) {
                                            obj2 = obj;
                                            obj = obj2;
                                        }
                                    }
                                }
                            }
                            return E;
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            E = objA;
                            px.f fVar = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(E));
                            iVarA = E.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (iVarA instanceof dx.i.Right) {
                                    throw new p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    }
                    if (i26 != 1) {
                        if (i26 == 2) {
                            i15 = cVar.f212136p;
                            i16 = cVar.f212135n;
                            i17 = cVar.f212134m;
                            i18 = cVar.f212133l;
                            i19 = cVar.f212132k;
                            aVar = (ex.b) cVar.f212129g;
                            bVar = (ex.b) cVar.f212128f;
                            obj = (dx.j) cVar.f212127e;
                            passportsData2 = (PassportsData) cVar.f212126d;
                            try {
                                u.b(objA);
                                iVar = (dx.i) objA;
                                if (!(iVar instanceof dx.i.Left)) {
                                    if (iVar instanceof dx.i.Right) {
                                        throw new p();
                                    }
                                    byte[] bArr2 = (byte[]) ((dx.i.Right) iVar).b();
                                    tc3.b bVar3 = this.userDataDocumentsInteractor;
                                    cVar.f212126d = j.a(passportsData2);
                                    cVar.f212127e = obj;
                                    cVar.f212128f = j.a(bVar);
                                    cVar.f212129g = j.a(aVar);
                                    cVar.f212130h = j.a(iVar);
                                    cVar.f212131j = j.a(bArr2);
                                    cVar.f212132k = i19;
                                    cVar.f212133l = i18;
                                    cVar.f212134m = i17;
                                    cVar.f212135n = i16;
                                    cVar.f212136p = i15;
                                    cVar.f212137q = 0;
                                    cVar.f212138r = 0;
                                    cVar.f212141v = 3;
                                    objA = bVar3.f(bArr2, cVar);
                                    if (objA != E) {
                                        obj2 = obj;
                                    }
                                    return E;
                                }
                            } catch (ex.c e18) {
                                e = e18;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e19) {
                                throw e19;
                            } catch (Exception e25) {
                                e = e25;
                                E = obj;
                                px.f fVar2 = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar2.d(message, e, px.c.a(E));
                                iVarA = E.a(e);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (iVarA instanceof dx.i.Right) {
                                        throw new p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                        } else {
                            if (i26 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj2 = (dx.j) cVar.f212127e;
                            u.b(objA);
                        }
                        obj = obj2;
                    } else {
                        u.b(objA);
                    }
                    return new dx.i.Right(i0.f148189a);
                } catch (Exception e26) {
                    e = e26;
                }
            } catch (CancellationException e27) {
                throw e27;
            }
        } catch (ex.c e28) {
            e = e28;
        } catch (CancellationException e29) {
            throw e29;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009f, code lost:
    
        if (r8 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e4, code lost:
    
        if (r8 == r1) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(wc3.h.Params r7, tq.e<? super dx.i<? extends dx.b, oq.i0>> r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wc3.h.e(wc3.h$a, tq.e):java.lang.Object");
    }
}
