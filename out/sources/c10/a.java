package c10;

import dx.i;
import dx.j;
import java.util.concurrent.CancellationException;
import my.JWSHeaderData;
import my.JWSPayloadData;
import my.JWSSignerData;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import px.f;
import sn.r;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ4\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lc10/a;", "Lly/a;", "Lly/b;", "Lmy/a;", "headerFactory", "Lmy/c;", "payloadFactory", "Liy/a;", "base64Coder", "<init>", "(Lly/b;Lly/b;Liy/a;)V", "headerData", "payloadData", "Lmy/d;", "signerData", "Ldx/i;", "Ldx/b;", "", "a", "(Lmy/a;Lmy/c;Lmy/d;Ltq/e;)Ljava/lang/Object;", "Lly/b;", "b", "c", "Liy/a;", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements ly.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ly.b<JWSHeaderData> headerFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ly.b<JWSPayloadData> payloadFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: c10.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C0597a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f22535d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f22536e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f22537f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f22538g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f22539h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f22540j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f22541k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f22542l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f22543m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f22544n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f22545p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f22546q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f22547r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f22549t;

        C0597a(tq.e<? super C0597a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f22547r = obj;
            this.f22549t |= PKIFailureInfo.systemUnavail;
            return a.this.a(null, null, null, this);
        }
    }

    public a(ly.b<JWSHeaderData> bVar, ly.b<JWSPayloadData> bVar2, iy.a aVar) {
        this.headerFactory = bVar;
        this.payloadFactory = bVar2;
        this.base64Coder = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0115  */
    /* JADX WARN: Code duplicated, block: B:55:0x017a  */
    /* JADX WARN: Code duplicated, block: B:58:0x018b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0199  */
    /* JADX WARN: Code duplicated, block: B:61:0x019d  */
    /* JADX WARN: Code duplicated, block: B:64:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // ly.a
    public Object a(JWSHeaderData jWSHeaderData, JWSPayloadData jWSPayloadData, JWSSignerData jWSSignerData, tq.e<? super i<? extends dx.b, String>> eVar) throws Throwable {
        C0597a c0597a;
        String message;
        i iVarA;
        Object objB;
        int i15;
        JWSHeaderData jWSHeaderData2;
        JWSPayloadData jWSPayloadData2;
        JWSSignerData jWSSignerData2;
        int i16;
        int i17;
        int i18;
        ex.b bVar;
        j<dx.b> jVar;
        int i19;
        ex.b bVar2;
        String str;
        Object objA;
        String str2;
        JWSSignerData jWSSignerData3;
        if (eVar instanceof C0597a) {
            c0597a = (C0597a) eVar;
            int i25 = c0597a.f22549t;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                c0597a.f22549t = i25 - PKIFailureInfo.systemUnavail;
            } else {
                c0597a = new C0597a(eVar);
            }
        } else {
            c0597a = new C0597a(eVar);
        }
        Object objA2 = c0597a.f22547r;
        Object objE = uq.b.e();
        int i26 = c0597a.f22549t;
        ?? r15 = 1;
        try {
            try {
                try {
                    if (i26 == 0) {
                        u.b(objA2);
                        j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            ly.b<JWSHeaderData> bVar3 = this.headerFactory;
                            c0597a.f22535d = vq.j.a(jWSHeaderData);
                            c0597a.f22536e = jWSPayloadData;
                            c0597a.f22537f = jWSSignerData;
                            c0597a.f22538g = jVarA;
                            c0597a.f22539h = vq.j.a(aVar);
                            c0597a.f22540j = aVar;
                            i15 = 0;
                            c0597a.f22542l = 0;
                            c0597a.f22543m = 0;
                            c0597a.f22544n = 0;
                            c0597a.f22545p = 0;
                            c0597a.f22546q = 0;
                            c0597a.f22549t = 1;
                            objA2 = bVar3.a(jWSHeaderData, c0597a);
                            if (objA2 != objE) {
                                jWSHeaderData2 = jWSHeaderData;
                                jWSPayloadData2 = jWSPayloadData;
                                jWSSignerData2 = jWSSignerData;
                                i16 = 0;
                                i17 = 0;
                                i18 = 0;
                                bVar = aVar;
                                jVar = jVarA;
                                i19 = 0;
                                bVar2 = bVar;
                                str = (String) objA2;
                                ly.b<JWSPayloadData> bVar4 = this.payloadFactory;
                                c0597a.f22535d = vq.j.a(jWSHeaderData2);
                                c0597a.f22536e = vq.j.a(jWSPayloadData2);
                                c0597a.f22537f = jWSSignerData2;
                                c0597a.f22538g = jVar;
                                c0597a.f22539h = vq.j.a(bVar);
                                c0597a.f22540j = bVar2;
                                c0597a.f22541k = str;
                                c0597a.f22542l = i19;
                                c0597a.f22543m = i18;
                                c0597a.f22544n = i17;
                                c0597a.f22545p = i16;
                                c0597a.f22546q = i15;
                                c0597a.f22549t = 2;
                                objA = bVar4.a(jWSPayloadData2, c0597a);
                                if (objA != objE) {
                                    str2 = str;
                                    objA2 = objA;
                                    jWSSignerData3 = jWSSignerData2;
                                    jo.b bVar5 = new jo.b(r.w(io.c.i(str2)), jo.a.f(new String((byte[]) bVar2.a(iy.a.c(this.base64Coder, (String) objA2, null, 2, null)), fu.d.UTF_8)));
                                    bVar5.r(new b(jWSSignerData3.getPrivateKey(), jWSSignerData3.getAlgorithm()));
                                    return new i.Right(bVar5.o());
                                }
                            }
                            return objE;
                        } catch (ex.c e15) {
                            e = e15;
                            return new i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            r15 = jVarA;
                            f fVar = f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(r15));
                            iVarA = r15.a(e);
                            if (iVarA instanceof i.Left) {
                                objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                            } else {
                                if (iVarA instanceof i.Right) {
                                    throw new p();
                                }
                                objB = ((i.Right) iVarA).b();
                            }
                            return new i.Left(objB);
                        }
                    }
                    if (i26 == 1) {
                        int i27 = c0597a.f22546q;
                        int i28 = c0597a.f22545p;
                        int i29 = c0597a.f22544n;
                        int i35 = c0597a.f22543m;
                        int i36 = c0597a.f22542l;
                        ex.b bVar6 = (ex.b) c0597a.f22540j;
                        ex.b bVar7 = (ex.b) c0597a.f22539h;
                        j<dx.b> jVar2 = (j) c0597a.f22538g;
                        jWSSignerData2 = (JWSSignerData) c0597a.f22537f;
                        jWSPayloadData2 = (JWSPayloadData) c0597a.f22536e;
                        jWSHeaderData2 = (JWSHeaderData) c0597a.f22535d;
                        try {
                            u.b(objA2);
                            i15 = i27;
                            bVar2 = bVar6;
                            i18 = i35;
                            i17 = i29;
                            i16 = i28;
                            jVar = jVar2;
                            bVar = bVar7;
                            i19 = i36;
                            str = (String) objA2;
                            ly.b<JWSPayloadData> bVar8 = this.payloadFactory;
                            c0597a.f22535d = vq.j.a(jWSHeaderData2);
                            c0597a.f22536e = vq.j.a(jWSPayloadData2);
                            c0597a.f22537f = jWSSignerData2;
                            c0597a.f22538g = jVar;
                            c0597a.f22539h = vq.j.a(bVar);
                            c0597a.f22540j = bVar2;
                            c0597a.f22541k = str;
                            c0597a.f22542l = i19;
                            c0597a.f22543m = i18;
                            c0597a.f22544n = i17;
                            c0597a.f22545p = i16;
                            c0597a.f22546q = i15;
                            c0597a.f22549t = 2;
                            objA = bVar8.a(jWSPayloadData2, c0597a);
                            if (objA != objE) {
                                str2 = str;
                                objA2 = objA;
                                jWSSignerData3 = jWSSignerData2;
                            }
                            return objE;
                        } catch (ex.c e18) {
                            e = e18;
                            return new i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        } catch (Exception e25) {
                            e = e25;
                            r15 = jVar2;
                            f fVar2 = f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar2.d(message, e, px.c.a(r15));
                            iVarA = r15.a(e);
                            if (iVarA instanceof i.Left) {
                                objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                            } else {
                                if (iVarA instanceof i.Right) {
                                    throw new p();
                                }
                                objB = ((i.Right) iVarA).b();
                            }
                            return new i.Left(objB);
                        }
                    }
                    if (i26 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (String) c0597a.f22541k;
                    bVar2 = (ex.b) c0597a.f22540j;
                    jWSSignerData3 = (JWSSignerData) c0597a.f22537f;
                    u.b(objA2);
                    jo.b bVar9 = new jo.b(r.w(io.c.i(str2)), jo.a.f(new String((byte[]) bVar2.a(iy.a.c(this.base64Coder, (String) objA2, null, 2, null)), fu.d.UTF_8)));
                    bVar9.r(new b(jWSSignerData3.getPrivateKey(), jWSSignerData3.getAlgorithm()));
                    return new i.Right(bVar9.o());
                } catch (CancellationException e26) {
                    throw e26;
                }
            } catch (Exception e27) {
                e = e27;
            }
        } catch (ex.c e28) {
            e = e28;
        } catch (CancellationException e29) {
            throw e29;
        }
    }
}
