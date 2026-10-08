package nr1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import ju.z0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0082@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\n\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\r\u0010\fR\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0012"}, d2 = {"Lnr1/c;", "Lnr1/b;", "<init>", "()V", "Ldx/i;", "Ldx/b;", "Lnr1/b$a;", "d", "(Ltq/e;)Ljava/lang/Object;", "", "pageId", "e", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "a", "", "Z", "hasSimulatedError", "b", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements nr1.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f137865c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f137866d;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean hasSimulatedError;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f137868d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f137869e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f137870f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f137871g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f137872h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f137873j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f137874k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f137875l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f137876m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f137878p;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f137876m = obj;
            this.f137878p |= PKIFailureInfo.systemUnavail;
            return c.this.d(this);
        }
    }

    /* JADX INFO: renamed from: nr1.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C3401c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f137879d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f137880e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f137882g;

        C3401c(tq.e<? super C3401c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f137880e = obj;
            this.f137882g |= PKIFailureInfo.systemUnavail;
            return c.this.e(null, this);
        }
    }

    static {
        gu.b.Companion companion = gu.b.INSTANCE;
        f137866d = gu.d.q(2, gu.e.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [nr1.c$b, tq.e] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
    public final Object d(tq.e<? super dx.i<? extends dx.b, nr1.b.MockPage>> eVar) throws Throwable {
        ?? bVar;
        Object objB;
        ex.c e15;
        if (eVar instanceof b) {
            b bVar2 = (b) eVar;
            int i15 = bVar2.f137878p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar2.f137878p = i15 - PKIFailureInfo.systemUnavail;
                bVar = bVar2;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f137876m;
        Object objE = uq.b.e();
        int i16 = bVar.f137878p;
        int i17 = 0;
        try {
            try {
                if (i16 == 0) {
                    oq.u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        long j15 = f137866d;
                        bVar.f137873j = jVarA;
                        bVar.f137874k = vq.j.a(aVar);
                        bVar.f137875l = vq.j.a(aVar);
                        bVar.f137868d = 0;
                        bVar.f137869e = 0;
                        bVar.f137870f = 0;
                        bVar.f137871g = 0;
                        bVar.f137872h = 0;
                        bVar.f137878p = 1;
                        if (z0.c(j15, bVar) == objE) {
                            return objE;
                        }
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        bVar = jVarA;
                        e = e18;
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
                        oq.u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                List listX0 = pq.v.X0(d.f137884a, 10);
                ArrayList arrayList = new ArrayList(pq.v.y(listX0, 10));
                for (Object obj2 : listX0) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        pq.v.x();
                    }
                    arrayList.add(new Cheese(i18, (String) obj2));
                    i17 = i18;
                }
                return new dx.i.Right(new nr1.b.MockPage(arrayList, "2"));
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, tq.e<? super dx.i<? extends dx.b, nr1.b.MockPage>> eVar) throws Throwable {
        C3401c c3401c;
        if (eVar instanceof C3401c) {
            c3401c = (C3401c) eVar;
            int i15 = c3401c.f137882g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c3401c.f137882g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c3401c = new C3401c(eVar);
            }
        } else {
            c3401c = new C3401c(eVar);
        }
        Object obj = c3401c.f137880e;
        Object objE = uq.b.e();
        int i16 = c3401c.f137882g;
        if (i16 == 0) {
            oq.u.b(obj);
            long j15 = f137866d;
            c3401c.f137879d = str;
            c3401c.f137882g = 1;
            if (z0.c(j15, c3401c) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) c3401c.f137879d;
            oq.u.b(obj);
        }
        int i17 = (Integer.parseInt(str) - 1) * 10;
        if (!this.hasSimulatedError && fr.t.c(str, "3")) {
            this.hasSimulatedError = true;
            return new dx.i.Left(new dx.b.Business(null, null, mx.b.b("This is a simulated error", ""), mx.b.b("PagingManager received an error when loading a page and returned PageState.Error, which is now being handled in VM.", ""), null, mx.b.b("Retry loading page", ""), mx.b.b("Close", ""), 19, null));
        }
        List listX0 = pq.v.X0(pq.v.f0(d.f137884a, i17), 10);
        ArrayList arrayList = new ArrayList(pq.v.y(listX0, 10));
        int i18 = 0;
        for (Object obj2 : listX0) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                pq.v.x();
            }
            arrayList.add(new Cheese(i18 + i17 + 1, (String) obj2));
            i18 = i19;
        }
        return new dx.i.Right(new nr1.b.MockPage(arrayList, String.valueOf(Integer.parseInt(str) + 1)));
    }

    @Override // nr1.b
    public Object a(String str, tq.e<? super dx.i<? extends dx.b, nr1.b.MockPage>> eVar) {
        if (fr.t.c(str, "1")) {
            return d(eVar);
        }
        return fr.t.c(str, com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f37012h1) ? new dx.i.Right(new nr1.b.MockPage(pq.v.n(), com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f37012h1)) : e(str, eVar);
    }
}
