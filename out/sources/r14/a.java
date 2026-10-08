package r14;

import b00.c;
import bc4.e;
import dx.b;
import dx.g;
import dx.i;
import dx.j;
import java.util.concurrent.CancellationException;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import px.f;
import vq.d;
import wx.FileContent;
import wx.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lr14/a;", "Lbc4/e;", "Lb00/c;", "imageConverter", "Lz04/a;", "fileStorageRepository", "Lqx/a;", "imagePropertiesProvider", "<init>", "(Lb00/c;Lz04/a;Lqx/a;)V", "Lbc4/e$a;", "params", "Lwx/c;", "d", "(Lbc4/e$a;Ltq/e;)Ljava/lang/Object;", "a", "Lb00/c;", "b", "Lz04/a;", "c", "Lqx/a;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c imageConverter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final z04.a fileStorageRepository;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final qx.a imagePropertiesProvider;

    /* JADX INFO: renamed from: r14.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C4328a extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f170721d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f170722e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f170723f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f170724g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f170725h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f170726j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f170727k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f170728l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f170729m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f170730n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f170731p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f170732q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f170734s;

        C4328a(tq.e<? super C4328a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f170732q = obj;
            this.f170734s |= PKIFailureInfo.systemUnavail;
            return a.this.c(null, this);
        }
    }

    public a(c cVar, z04.a aVar, qx.a aVar2) {
        this.imageConverter = cVar;
        this.fileStorageRepository = aVar;
        this.imagePropertiesProvider = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0163  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(e.Params params, tq.e<? super FileContent> eVar) throws Throwable {
        C4328a c4328a;
        Object objB;
        i left;
        int i15;
        int i16;
        j<b> jVar;
        e.Params params2;
        int i17;
        j<b> jVarA;
        ex.b bVar;
        ex.b bVar2;
        ex.b bVar3;
        int i18;
        int i19;
        ex.b bVar4;
        ex.b aVar;
        int i25;
        byte[] bytes;
        if (eVar instanceof C4328a) {
            c4328a = (C4328a) eVar;
            int i26 = c4328a.f170734s;
            if ((i26 & PKIFailureInfo.systemUnavail) != 0) {
                c4328a.f170734s = i26 - PKIFailureInfo.systemUnavail;
            } else {
                c4328a = new C4328a(eVar);
            }
        } else {
            c4328a = new C4328a(eVar);
        }
        C4328a c4328a2 = c4328a;
        Object objA = c4328a2.f170732q;
        Object objE = uq.b.e();
        ?? r15 = c4328a2.f170734s;
        try {
            try {
                if (r15 != 0) {
                    try {
                        if (r15 == 1) {
                            int i27 = c4328a2.f170731p;
                            i15 = c4328a2.f170730n;
                            i16 = c4328a2.f170729m;
                            int i28 = c4328a2.f170728l;
                            int i29 = c4328a2.f170727k;
                            ex.b bVar5 = (ex.b) c4328a2.f170726j;
                            ex.b bVar6 = (ex.b) c4328a2.f170724g;
                            ex.b bVar7 = (ex.b) c4328a2.f170723f;
                            jVar = (j) c4328a2.f170722e;
                            params2 = (e.Params) c4328a2.f170721d;
                            try {
                                u.b(objA);
                                i17 = i27;
                                jVarA = jVar;
                                bVar = bVar7;
                                bVar2 = bVar6;
                                bVar3 = bVar5;
                                i18 = i29;
                                i19 = i28;
                            } catch (ex.c e15) {
                                e = e15;
                                left = new i.Left((b) ex.d.a(e));
                            } catch (CancellationException e16) {
                                throw e16;
                            } catch (Exception e17) {
                                e = e17;
                                r15 = jVar;
                                f fVar = f.f163100a;
                                String message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar.d(message, e, px.c.a(r15));
                                i iVarA = r15.a(e);
                                if (iVarA instanceof i.Left) {
                                    objB = new b.Generic((Exception) ((i.Left) iVarA).b());
                                } else {
                                    if (!(iVarA instanceof i.Right)) {
                                        throw new p();
                                    }
                                    objB = ((i.Right) iVarA).b();
                                }
                                left = new i.Left(objB);
                            }
                        } else {
                            if (r15 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar4 = (ex.b) c4328a2.f170726j;
                            u.b(objA);
                        }
                        left = new i.Right(new FileContent((byte[]) bVar4.a((i) objA)));
                        return left.a();
                    } catch (CancellationException e18) {
                        throw e18;
                    }
                }
                u.b(objA);
                jVarA = xw.c.f221622a.a();
                aVar = new ex.a();
                wx.b file = params.getFile();
                i17 = 0;
                if (file instanceof k.Image) {
                    z04.a aVar2 = this.fileStorageRepository;
                    String name = ((k.Image) file).getMetadata().getName();
                    c4328a2.f170721d = vq.j.a(params);
                    c4328a2.f170722e = jVarA;
                    c4328a2.f170723f = vq.j.a(aVar);
                    c4328a2.f170724g = aVar;
                    c4328a2.f170725h = vq.j.a(file);
                    c4328a2.f170726j = aVar;
                    c4328a2.f170727k = 0;
                    c4328a2.f170728l = 0;
                    c4328a2.f170729m = 0;
                    c4328a2.f170730n = 0;
                    c4328a2.f170731p = 0;
                    c4328a2.f170734s = 1;
                    objA = aVar2.b(name, c4328a2);
                    if (objA != objE) {
                        params2 = params;
                        i15 = 0;
                        i16 = 0;
                        i19 = 0;
                        bVar3 = aVar;
                        bVar2 = bVar3;
                        bVar = bVar2;
                        i18 = 0;
                    }
                } else {
                    if (!(file instanceof wx.i.Image)) {
                        if (!(file instanceof wx.i.Regular) && !(file instanceof k.Regular)) {
                            throw new p();
                        }
                        aVar.b(g.f45096a);
                        throw new oq.g();
                    }
                    bytes = ((wx.i.Image) file).getFileContent().getBytes();
                    params2 = params;
                    jVar = jVarA;
                    i25 = 0;
                    i15 = 0;
                    i16 = 0;
                    i19 = 0;
                    bVar2 = aVar;
                    c cVar = this.imageConverter;
                    int thumbnailMaxSide = this.imagePropertiesProvider.getThumbnailMaxSide();
                    int defaultImageQuality = this.imagePropertiesProvider.getDefaultImageQuality();
                    c4328a2.f170721d = vq.j.a(params2);
                    c4328a2.f170722e = jVar;
                    c4328a2.f170723f = vq.j.a(aVar);
                    c4328a2.f170724g = vq.j.a(bVar2);
                    c4328a2.f170725h = vq.j.a(bytes);
                    c4328a2.f170726j = bVar2;
                    c4328a2.f170727k = i17;
                    c4328a2.f170728l = i19;
                    c4328a2.f170729m = i16;
                    c4328a2.f170730n = i15;
                    c4328a2.f170731p = i25;
                    c4328a2.f170734s = 2;
                    objA = c.a(cVar, bytes, 0.0f, thumbnailMaxSide, defaultImageQuality, null, c4328a2, 18, null);
                    if (objA != objE) {
                        bVar4 = bVar2;
                        left = new i.Right(new FileContent((byte[]) bVar4.a((i) objA)));
                        return left.a();
                    }
                }
                return objE;
                bytes = ((FileContent) bVar3.a((i) objA)).getBytes();
                ex.b bVar8 = bVar;
                jVar = jVarA;
                i25 = i17;
                i17 = i18;
                aVar = bVar8;
                c cVar2 = this.imageConverter;
                int thumbnailMaxSide2 = this.imagePropertiesProvider.getThumbnailMaxSide();
                int defaultImageQuality2 = this.imagePropertiesProvider.getDefaultImageQuality();
                c4328a2.f170721d = vq.j.a(params2);
                c4328a2.f170722e = jVar;
                c4328a2.f170723f = vq.j.a(aVar);
                c4328a2.f170724g = vq.j.a(bVar2);
                c4328a2.f170725h = vq.j.a(bytes);
                c4328a2.f170726j = bVar2;
                c4328a2.f170727k = i17;
                c4328a2.f170728l = i19;
                c4328a2.f170729m = i16;
                c4328a2.f170730n = i15;
                c4328a2.f170731p = i25;
                c4328a2.f170734s = 2;
                objA = c.a(cVar2, bytes, 0.0f, thumbnailMaxSide2, defaultImageQuality2, null, c4328a2, 18, null);
                if (objA != objE) {
                    bVar4 = bVar2;
                    left = new i.Right(new FileContent((byte[]) bVar4.a((i) objA)));
                    return left.a();
                }
                return objE;
            } catch (Exception e19) {
                e = e19;
            }
        } catch (ex.c e25) {
            e = e25;
        } catch (CancellationException e26) {
            throw e26;
        }
    }
}
