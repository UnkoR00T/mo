package hp0;

import android.graphics.Bitmap;
import dx.j;
import fr.k;
import java.util.concurrent.CancellationException;
import ju.g2;
import lp0.AttachmentDto;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vy.Coordinates;
import wx.i;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00182\u00020\u0001:\u0001\u0011B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lhp0/b;", "Lhp0/a;", "Lb00/c;", "imageConverter", "Lxx/a;", "exifDataManager", "Lqx/a;", "imagePropertiesProvider", "<init>", "(Lb00/c;Lxx/a;Lqx/a;)V", "Lwx/i$a;", "file", "", "maxImageSide", "Ldx/i;", "Ldx/b;", "Llp0/b;", "a", "(Lwx/i$a;Ljava/lang/Integer;Ltq/e;)Ljava/lang/Object;", "Lb00/c;", "b", "Lxx/a;", "c", "Lqx/a;", "d", "frontsrv_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements hp0.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f86158d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b00.c imageConverter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final xx.a exifDataManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final qx.a imagePropertiesProvider;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhp0/b$a;", "", "<init>", "()V", "", "FILE_NAME", "Ljava/lang/String;", "frontsrv_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: hp0.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C2008b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f86162d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f86163e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f86164f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f86165g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f86166h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f86167j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f86168k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f86169l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f86170m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f86171n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f86172p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f86173q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f86174r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f86175s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f86176t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f86177v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        /* synthetic */ Object f86178w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f86180y;

        C2008b(tq.e<? super C2008b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f86178w = obj;
            this.f86180y |= PKIFailureInfo.systemUnavail;
            return b.this.a(null, null, this);
        }
    }

    public b(b00.c cVar, xx.a aVar, qx.a aVar2) {
        this.imageConverter = cVar;
        this.exifDataManager = aVar;
        this.imagePropertiesProvider = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x038b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0397  */
    /* JADX WARN: Code duplicated, block: B:72:0x027d  */
    /* JADX WARN: Code duplicated, block: B:75:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:76:0x02da  */
    /* JADX WARN: Code duplicated, block: B:79:0x02eb A[Catch: Exception -> 0x0062, c -> 0x0065, CancellationException -> 0x0068, TryCatch #11 {Exception -> 0x0062, blocks: (B:16:0x005d, B:83:0x033b, B:87:0x0341, B:89:0x0350, B:92:0x035f, B:77:0x02e0, B:79:0x02eb, B:73:0x0287, B:57:0x018b), top: B:108:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x033a  */
    /* JADX WARN: Code duplicated, block: B:85:0x033f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0340 A[PHI: r11
      0x0340: PHI (r11v2 java.lang.String) = (r11v3 java.lang.String), (r11v4 java.lang.String) binds: [B:85:0x033f, B:78:0x02e9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x0368  */
    /* JADX WARN: Code duplicated, block: B:98:0x0379  */
    /* JADX WARN: Code duplicated, block: B:99:0x0387  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x00f9: MOVE (r4 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:39:0x00f9 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x00fd: MOVE (r4 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:41:0x00fd */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0101: MOVE (r4 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:43:0x0101 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v4, types: [dx.j, java.lang.Object] */
    @Override // hp0.a
    public Object a(i.Image image, Integer num, tq.e<? super dx.i<? extends dx.b, AttachmentDto>> eVar) throws Throwable {
        C2008b c2008b;
        Object obj;
        String message;
        dx.i iVarA;
        Object objB;
        Object objH;
        j<dx.b> jVar;
        i.Image image2;
        ex.b bVar;
        ex.b bVar2;
        Integer num2;
        int i15;
        int i16;
        int i17;
        int i18;
        ex.b bVar3;
        int i19;
        String str;
        String str2;
        String str3;
        ex.b bVar4;
        Bitmap bitmap;
        Bitmap bitmap2;
        Integer num3;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        j<dx.b> jVar2;
        Object obj2;
        Coordinates coordinates;
        Bitmap bitmap3;
        Integer num4;
        Object obj3;
        String str4;
        Integer num5;
        Bitmap bitmap4;
        Object objD;
        ex.b bVar5;
        Bitmap bitmap5;
        Object obj4;
        Bitmap bitmap6;
        Bitmap bitmap7;
        Object objL;
        if (eVar instanceof C2008b) {
            c2008b = (C2008b) eVar;
            int i35 = c2008b.f86180y;
            if ((i35 & PKIFailureInfo.systemUnavail) != 0) {
                c2008b.f86180y = i35 - PKIFailureInfo.systemUnavail;
            } else {
                c2008b = new C2008b(eVar);
            }
        } else {
            c2008b = new C2008b(eVar);
        }
        Object objA = c2008b.f86178w;
        Object objE = uq.b.e();
        ?? r15 = c2008b.f86180y;
        try {
            try {
                try {
                    if (r15 == 0) {
                        u.b(objA);
                        j<dx.b> jVarA = xw.c.f221622a.a();
                        ex.a aVar = new ex.a();
                        b00.c cVar = this.imageConverter;
                        byte[] bytes = image.getFileContent().getBytes();
                        c2008b.f86162d = image;
                        c2008b.f86163e = num;
                        c2008b.f86164f = jVarA;
                        c2008b.f86165g = vq.j.a(aVar);
                        c2008b.f86166h = aVar;
                        c2008b.f86167j = aVar;
                        c2008b.f86172p = 0;
                        c2008b.f86173q = 0;
                        c2008b.f86174r = 0;
                        c2008b.f86175s = 0;
                        c2008b.f86176t = 0;
                        c2008b.f86180y = 1;
                        objH = cVar.h(bytes, c2008b);
                        if (objH != objE) {
                            jVar = jVarA;
                            image2 = image;
                            bVar = aVar;
                            bVar2 = bVar;
                            num2 = num;
                            i15 = 0;
                            i16 = 0;
                            i17 = 0;
                            i18 = 0;
                            bVar3 = bVar2;
                            i19 = 0;
                        }
                        return objE;
                    }
                    if (r15 != 1) {
                        try {
                            if (r15 == 2) {
                                int i36 = c2008b.f86176t;
                                int i37 = c2008b.f86175s;
                                int i38 = c2008b.f86174r;
                                i26 = c2008b.f86173q;
                                i25 = c2008b.f86172p;
                                bitmap5 = (Bitmap) c2008b.f86168k;
                                bVar5 = (ex.b) c2008b.f86167j;
                                bVar = (ex.b) c2008b.f86166h;
                                ex.b bVar6 = (ex.b) c2008b.f86165g;
                                j<dx.b> jVar3 = (j) c2008b.f86164f;
                                Integer num6 = (Integer) c2008b.f86163e;
                                i.Image image3 = (i.Image) c2008b.f86162d;
                                try {
                                    u.b(objA);
                                    i15 = i36;
                                    obj4 = objA;
                                    bVar2 = bVar6;
                                    jVar = jVar3;
                                    num2 = num6;
                                    image2 = image3;
                                    i17 = i38;
                                    i16 = i37;
                                    bitmap6 = (Bitmap) bVar5.a((dx.i) obj4);
                                    g2.j(c2008b.getContext());
                                    b00.c cVar2 = this.imageConverter;
                                    int defaultImageQuality = this.imagePropertiesProvider.getDefaultImageQuality();
                                    c2008b.f86162d = image2;
                                    bitmap7 = bitmap5;
                                    c2008b.f86163e = vq.j.a(num2);
                                    c2008b.f86164f = jVar;
                                    c2008b.f86165g = vq.j.a(bVar2);
                                    c2008b.f86166h = vq.j.a(bVar);
                                    c2008b.f86167j = vq.j.a(bitmap7);
                                    c2008b.f86168k = vq.j.a(bitmap6);
                                    c2008b.f86172p = i25;
                                    c2008b.f86173q = i26;
                                    c2008b.f86174r = i17;
                                    c2008b.f86175s = i16;
                                    c2008b.f86176t = i15;
                                    c2008b.f86180y = 3;
                                    objL = cVar2.l(bitmap6, defaultImageQuality, c2008b);
                                    if (objL != objE) {
                                        num4 = num2;
                                        bVar4 = bVar;
                                        bitmap3 = bitmap6;
                                        obj3 = objL;
                                        i27 = i17;
                                        i28 = i16;
                                        i29 = i15;
                                        jVar2 = jVar;
                                        bitmap = bitmap7;
                                        str4 = (String) obj3;
                                        g2.j(c2008b.getContext());
                                        xx.a aVar2 = this.exifDataManager;
                                        num5 = num4;
                                        String uri = image2.getMetadata().getUri();
                                        bitmap4 = bitmap3;
                                        c2008b.f86162d = vq.j.a(image2);
                                        c2008b.f86163e = vq.j.a(num5);
                                        c2008b.f86164f = jVar2;
                                        c2008b.f86165g = vq.j.a(bVar2);
                                        c2008b.f86166h = vq.j.a(bVar4);
                                        c2008b.f86167j = vq.j.a(bitmap);
                                        c2008b.f86168k = vq.j.a(bitmap4);
                                        c2008b.f86169l = str4;
                                        c2008b.f86172p = i25;
                                        c2008b.f86173q = i26;
                                        c2008b.f86174r = i27;
                                        c2008b.f86175s = i28;
                                        c2008b.f86176t = i29;
                                        c2008b.f86180y = 4;
                                        objD = aVar2.d(uri, c2008b);
                                        if (objD != objE) {
                                            bitmap2 = bitmap4;
                                            str = str4;
                                            obj2 = objD;
                                            num3 = num5;
                                            coordinates = (Coordinates) obj2;
                                            g2.j(c2008b.getContext());
                                            if (coordinates != null) {
                                                Integer num7 = num3;
                                                xx.a aVar3 = this.exifDataManager;
                                                c2008b.f86162d = vq.j.a(image2);
                                                c2008b.f86163e = vq.j.a(num7);
                                                c2008b.f86164f = jVar2;
                                                c2008b.f86165g = vq.j.a(bVar2);
                                                c2008b.f86166h = vq.j.a(bVar4);
                                                c2008b.f86167j = vq.j.a(bitmap);
                                                c2008b.f86168k = vq.j.a(bitmap2);
                                                c2008b.f86169l = str;
                                                c2008b.f86170m = vq.j.a(coordinates);
                                                c2008b.f86171n = vq.j.a(coordinates);
                                                c2008b.f86172p = i25;
                                                c2008b.f86173q = i26;
                                                c2008b.f86174r = i27;
                                                c2008b.f86175s = i28;
                                                c2008b.f86176t = i29;
                                                c2008b.f86177v = 0;
                                                c2008b.f86180y = 5;
                                                objA = aVar3.a(str, coordinates, c2008b);
                                                if (objA != objE) {
                                                    str3 = str;
                                                }
                                            } else {
                                                str2 = str;
                                            }
                                            return new dx.i.Right(new AttachmentDto("image/jpeg", "photo_01", str2));
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
                                    r15 = jVar3;
                                    px.f fVar = px.f.f163100a;
                                    message = e.getMessage();
                                    if (message == null) {
                                        message = "";
                                    }
                                    fVar.d(message, e, px.c.a(r15));
                                    iVarA = r15.a(e);
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
                            if (r15 == 3) {
                                int i39 = c2008b.f86176t;
                                int i45 = c2008b.f86175s;
                                int i46 = c2008b.f86174r;
                                int i47 = c2008b.f86173q;
                                int i48 = c2008b.f86172p;
                                Bitmap bitmap8 = (Bitmap) c2008b.f86168k;
                                Bitmap bitmap9 = (Bitmap) c2008b.f86167j;
                                ex.b bVar7 = (ex.b) c2008b.f86166h;
                                ex.b bVar8 = (ex.b) c2008b.f86165g;
                                j<dx.b> jVar4 = (j) c2008b.f86164f;
                                Integer num8 = (Integer) c2008b.f86163e;
                                image2 = (i.Image) c2008b.f86162d;
                                u.b(objA);
                                i29 = i39;
                                obj3 = objA;
                                bVar2 = bVar8;
                                bitmap3 = bitmap8;
                                i25 = i48;
                                i26 = i47;
                                i27 = i46;
                                i28 = i45;
                                jVar2 = jVar4;
                                bitmap = bitmap9;
                                num4 = num8;
                                bVar4 = bVar7;
                                str4 = (String) obj3;
                                g2.j(c2008b.getContext());
                                xx.a aVar4 = this.exifDataManager;
                                num5 = num4;
                                String uri2 = image2.getMetadata().getUri();
                                bitmap4 = bitmap3;
                                c2008b.f86162d = vq.j.a(image2);
                                c2008b.f86163e = vq.j.a(num5);
                                c2008b.f86164f = jVar2;
                                c2008b.f86165g = vq.j.a(bVar2);
                                c2008b.f86166h = vq.j.a(bVar4);
                                c2008b.f86167j = vq.j.a(bitmap);
                                c2008b.f86168k = vq.j.a(bitmap4);
                                c2008b.f86169l = str4;
                                c2008b.f86172p = i25;
                                c2008b.f86173q = i26;
                                c2008b.f86174r = i27;
                                c2008b.f86175s = i28;
                                c2008b.f86176t = i29;
                                c2008b.f86180y = 4;
                                objD = aVar4.d(uri2, c2008b);
                                if (objD != objE) {
                                    bitmap2 = bitmap4;
                                    str = str4;
                                    obj2 = objD;
                                    num3 = num5;
                                    coordinates = (Coordinates) obj2;
                                    g2.j(c2008b.getContext());
                                    if (coordinates != null) {
                                        Integer num9 = num3;
                                        xx.a aVar5 = this.exifDataManager;
                                        c2008b.f86162d = vq.j.a(image2);
                                        c2008b.f86163e = vq.j.a(num9);
                                        c2008b.f86164f = jVar2;
                                        c2008b.f86165g = vq.j.a(bVar2);
                                        c2008b.f86166h = vq.j.a(bVar4);
                                        c2008b.f86167j = vq.j.a(bitmap);
                                        c2008b.f86168k = vq.j.a(bitmap2);
                                        c2008b.f86169l = str;
                                        c2008b.f86170m = vq.j.a(coordinates);
                                        c2008b.f86171n = vq.j.a(coordinates);
                                        c2008b.f86172p = i25;
                                        c2008b.f86173q = i26;
                                        c2008b.f86174r = i27;
                                        c2008b.f86175s = i28;
                                        c2008b.f86176t = i29;
                                        c2008b.f86177v = 0;
                                        c2008b.f86180y = 5;
                                        objA = aVar5.a(str, coordinates, c2008b);
                                        if (objA != objE) {
                                            str3 = str;
                                        }
                                    } else {
                                        str2 = str;
                                    }
                                    return new dx.i.Right(new AttachmentDto("image/jpeg", "photo_01", str2));
                                }
                                return objE;
                            }
                            if (r15 == 4) {
                                int i49 = c2008b.f86176t;
                                i28 = c2008b.f86175s;
                                i27 = c2008b.f86174r;
                                i26 = c2008b.f86173q;
                                i25 = c2008b.f86172p;
                                str = (String) c2008b.f86169l;
                                bitmap2 = (Bitmap) c2008b.f86168k;
                                bitmap = (Bitmap) c2008b.f86167j;
                                bVar4 = (ex.b) c2008b.f86166h;
                                ex.b bVar9 = (ex.b) c2008b.f86165g;
                                j<dx.b> jVar5 = (j) c2008b.f86164f;
                                num3 = (Integer) c2008b.f86163e;
                                i.Image image4 = (i.Image) c2008b.f86162d;
                                try {
                                    u.b(objA);
                                    image2 = image4;
                                    obj2 = objA;
                                    bVar2 = bVar9;
                                    i29 = i49;
                                    jVar2 = jVar5;
                                    coordinates = (Coordinates) obj2;
                                    g2.j(c2008b.getContext());
                                    if (coordinates != null) {
                                        Integer num10 = num3;
                                        xx.a aVar6 = this.exifDataManager;
                                        c2008b.f86162d = vq.j.a(image2);
                                        c2008b.f86163e = vq.j.a(num10);
                                        c2008b.f86164f = jVar2;
                                        c2008b.f86165g = vq.j.a(bVar2);
                                        c2008b.f86166h = vq.j.a(bVar4);
                                        c2008b.f86167j = vq.j.a(bitmap);
                                        c2008b.f86168k = vq.j.a(bitmap2);
                                        c2008b.f86169l = str;
                                        c2008b.f86170m = vq.j.a(coordinates);
                                        c2008b.f86171n = vq.j.a(coordinates);
                                        c2008b.f86172p = i25;
                                        c2008b.f86173q = i26;
                                        c2008b.f86174r = i27;
                                        c2008b.f86175s = i28;
                                        c2008b.f86176t = i29;
                                        c2008b.f86177v = 0;
                                        c2008b.f86180y = 5;
                                        objA = aVar6.a(str, coordinates, c2008b);
                                        if (objA != objE) {
                                            str3 = str;
                                        }
                                        return objE;
                                    }
                                    str2 = str;
                                    return new dx.i.Right(new AttachmentDto("image/jpeg", "photo_01", str2));
                                } catch (ex.c e18) {
                                    e = e18;
                                    return new dx.i.Left((dx.b) ex.d.a(e));
                                } catch (CancellationException e19) {
                                    throw e19;
                                } catch (Exception e25) {
                                    e = e25;
                                    r15 = jVar5;
                                    px.f fVar2 = px.f.f163100a;
                                    message = e.getMessage();
                                    if (message == null) {
                                        message = "";
                                    }
                                    fVar2.d(message, e, px.c.a(r15));
                                    iVarA = r15.a(e);
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
                            if (r15 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            str3 = (String) c2008b.f86169l;
                            u.b(objA);
                        } catch (CancellationException e26) {
                            throw e26;
                        }
                    } else {
                        int i55 = c2008b.f86176t;
                        int i56 = c2008b.f86175s;
                        int i57 = c2008b.f86174r;
                        int i58 = c2008b.f86173q;
                        int i59 = c2008b.f86172p;
                        ex.b bVar10 = (ex.b) c2008b.f86167j;
                        ex.b bVar11 = (ex.b) c2008b.f86166h;
                        ex.b bVar12 = (ex.b) c2008b.f86165g;
                        jVar = (j) c2008b.f86164f;
                        num2 = (Integer) c2008b.f86163e;
                        image2 = (i.Image) c2008b.f86162d;
                        u.b(objA);
                        i15 = i55;
                        objH = objA;
                        bVar2 = bVar12;
                        bVar = bVar11;
                        bVar3 = bVar10;
                        i19 = i59;
                        i18 = i58;
                        i17 = i57;
                        i16 = i56;
                    }
                    str2 = (String) objA;
                    if (str2 == null) {
                        str = str3;
                        str2 = str;
                    }
                    return new dx.i.Right(new AttachmentDto("image/jpeg", "photo_01", str2));
                    Bitmap bitmap10 = (Bitmap) bVar3.a((dx.i) objH);
                    g2.j(c2008b.getContext());
                    b00.c cVar3 = this.imageConverter;
                    b00.f.ReduceDimension reduceDimension = new b00.f.ReduceDimension(num2 != null ? num2.intValue() : this.imagePropertiesProvider.getDefaultImageMaxSide());
                    c2008b.f86162d = image2;
                    c2008b.f86163e = vq.j.a(num2);
                    c2008b.f86164f = jVar;
                    c2008b.f86165g = vq.j.a(bVar2);
                    c2008b.f86166h = vq.j.a(bVar);
                    c2008b.f86167j = bVar;
                    c2008b.f86168k = vq.j.a(bitmap10);
                    c2008b.f86172p = i19;
                    c2008b.f86173q = i18;
                    c2008b.f86174r = i17;
                    c2008b.f86175s = i16;
                    c2008b.f86176t = i15;
                    c2008b.f86180y = 2;
                    Object objF = cVar3.f(bitmap10, reduceDimension, c2008b);
                    if (objF != objE) {
                        i26 = i18;
                        i25 = i19;
                        bVar5 = bVar;
                        bitmap5 = bitmap10;
                        obj4 = objF;
                        bitmap6 = (Bitmap) bVar5.a((dx.i) obj4);
                        g2.j(c2008b.getContext());
                        b00.c cVar4 = this.imageConverter;
                        int defaultImageQuality2 = this.imagePropertiesProvider.getDefaultImageQuality();
                        c2008b.f86162d = image2;
                        bitmap7 = bitmap5;
                        c2008b.f86163e = vq.j.a(num2);
                        c2008b.f86164f = jVar;
                        c2008b.f86165g = vq.j.a(bVar2);
                        c2008b.f86166h = vq.j.a(bVar);
                        c2008b.f86167j = vq.j.a(bitmap7);
                        c2008b.f86168k = vq.j.a(bitmap6);
                        c2008b.f86172p = i25;
                        c2008b.f86173q = i26;
                        c2008b.f86174r = i17;
                        c2008b.f86175s = i16;
                        c2008b.f86176t = i15;
                        c2008b.f86180y = 3;
                        objL = cVar4.l(bitmap6, defaultImageQuality2, c2008b);
                        if (objL != objE) {
                            num4 = num2;
                            bVar4 = bVar;
                            bitmap3 = bitmap6;
                            obj3 = objL;
                            i27 = i17;
                            i28 = i16;
                            i29 = i15;
                            jVar2 = jVar;
                            bitmap = bitmap7;
                            str4 = (String) obj3;
                            g2.j(c2008b.getContext());
                            xx.a aVar7 = this.exifDataManager;
                            num5 = num4;
                            String uri3 = image2.getMetadata().getUri();
                            bitmap4 = bitmap3;
                            c2008b.f86162d = vq.j.a(image2);
                            c2008b.f86163e = vq.j.a(num5);
                            c2008b.f86164f = jVar2;
                            c2008b.f86165g = vq.j.a(bVar2);
                            c2008b.f86166h = vq.j.a(bVar4);
                            c2008b.f86167j = vq.j.a(bitmap);
                            c2008b.f86168k = vq.j.a(bitmap4);
                            c2008b.f86169l = str4;
                            c2008b.f86172p = i25;
                            c2008b.f86173q = i26;
                            c2008b.f86174r = i27;
                            c2008b.f86175s = i28;
                            c2008b.f86176t = i29;
                            c2008b.f86180y = 4;
                            objD = aVar7.d(uri3, c2008b);
                            if (objD != objE) {
                                bitmap2 = bitmap4;
                                str = str4;
                                obj2 = objD;
                                num3 = num5;
                                coordinates = (Coordinates) obj2;
                                g2.j(c2008b.getContext());
                                if (coordinates != null) {
                                    Integer num11 = num3;
                                    xx.a aVar8 = this.exifDataManager;
                                    c2008b.f86162d = vq.j.a(image2);
                                    c2008b.f86163e = vq.j.a(num11);
                                    c2008b.f86164f = jVar2;
                                    c2008b.f86165g = vq.j.a(bVar2);
                                    c2008b.f86166h = vq.j.a(bVar4);
                                    c2008b.f86167j = vq.j.a(bitmap);
                                    c2008b.f86168k = vq.j.a(bitmap2);
                                    c2008b.f86169l = str;
                                    c2008b.f86170m = vq.j.a(coordinates);
                                    c2008b.f86171n = vq.j.a(coordinates);
                                    c2008b.f86172p = i25;
                                    c2008b.f86173q = i26;
                                    c2008b.f86174r = i27;
                                    c2008b.f86175s = i28;
                                    c2008b.f86176t = i29;
                                    c2008b.f86177v = 0;
                                    c2008b.f86180y = 5;
                                    objA = aVar8.a(str, coordinates, c2008b);
                                    if (objA != objE) {
                                        str3 = str;
                                        str2 = (String) objA;
                                        if (str2 == null) {
                                            str = str3;
                                            str2 = str;
                                        }
                                    }
                                } else {
                                    str2 = str;
                                }
                                return new dx.i.Right(new AttachmentDto("image/jpeg", "photo_01", str2));
                            }
                        }
                    }
                    return objE;
                } catch (Exception e27) {
                    e = e27;
                }
            } catch (ex.c e28) {
                e = e28;
            } catch (CancellationException e29) {
                throw e29;
            } catch (Exception e35) {
                e = e35;
                r15 = obj;
            }
        } catch (ex.c e36) {
            e = e36;
        } catch (CancellationException e37) {
            throw e37;
        }
    }
}
