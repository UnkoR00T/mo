package dw3;

import android.graphics.Bitmap;
import android.net.Uri;
import az.d;
import b00.c;
import dx.b;
import dx.i;
import dx.j;
import java.io.File;
import java.util.concurrent.CancellationException;
import ju.g2;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import px.f;
import tq.e;
import wx.FileContent;
import wx.FilePickerMetadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ldw3/a;", "Lhw3/a;", "Lb00/c;", "imageConverter", "Laz/d;", "fileConverter", "<init>", "(Lb00/c;Laz/d;)V", "Lhw3/a$a;", "photoData", "Lhw3/a$b;", "requirements", "Ldx/i;", "Ldx/b;", "Lwx/i$a;", "a", "(Lhw3/a$a;Lhw3/a$b;Ltq/e;)Ljava/lang/Object;", "Lb00/c;", "b", "Laz/d;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements hw3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c imageConverter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d fileConverter;

    /* JADX INFO: renamed from: dw3.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C1026a extends vq.d {
        int A;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f44999d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f45000e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f45001f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f45002g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f45003h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f45004j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f45005k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f45006l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f45007m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f45008n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f45009p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f45010q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f45011r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f45012s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f45013t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f45014v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        float f45015w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        float f45016x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        /* synthetic */ Object f45017y;

        C1026a(e<? super C1026a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f45017y = obj;
            this.A |= PKIFailureInfo.systemUnavail;
            return a.this.a(null, null, this);
        }
    }

    public a(c cVar, d dVar) {
        this.imageConverter = cVar;
        this.fileConverter = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:112:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:113:0x040d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0411  */
    /* JADX WARN: Code duplicated, block: B:118:0x041d  */
    /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0302  */
    /* JADX WARN: Code duplicated, block: B:76:0x037e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v4, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    @Override // hw3.a
    public Object a(hw3.a.PhotoData c2031a, hw3.a.Requirements bVar, e<? super i<? extends b, wx.i.Image>> eVar) throws Throwable {
        C1026a c1026a;
        String message;
        i iVarA;
        Object objB;
        File file;
        String strA;
        int i15;
        Object obj;
        ex.b bVar2;
        hw3.a.PhotoData c2031a2;
        hw3.a.Requirements bVar3;
        int i16;
        int i17;
        int i18;
        ex.b bVar4;
        ex.b bVar5;
        int i19;
        File file2;
        int i25;
        float f15;
        Bitmap bitmap;
        ex.b bVar6;
        Object obj2;
        int i26;
        float f16;
        String str;
        int i27;
        int i28;
        ex.b bVar7;
        int i29;
        Bitmap bitmap2;
        ?? r18;
        Object objF;
        Object obj3;
        String str2;
        float f17;
        Object obj4;
        int i35;
        Bitmap bitmap3;
        ex.b bVar8;
        Bitmap bitmap4;
        int i36;
        float f18;
        int i37;
        ?? r15;
        int i38;
        hw3.a.PhotoData c2031a3;
        hw3.a.PhotoData c2031a4;
        if (eVar instanceof C1026a) {
            c1026a = (C1026a) eVar;
            int i39 = c1026a.A;
            if ((i39 & PKIFailureInfo.systemUnavail) != 0) {
                c1026a.A = i39 - PKIFailureInfo.systemUnavail;
            } else {
                c1026a = new C1026a(eVar);
            }
        } else {
            c1026a = new C1026a(eVar);
        }
        Object objC = c1026a.f45017y;
        Object objE = uq.b.e();
        int i45 = c1026a.A;
        ?? r16 = 4;
        try {
            try {
                try {
                    try {
                        try {
                            if (i45 == 0) {
                                u.b(objC);
                                j<b> jVarA = xw.c.f221622a.a();
                                ex.a aVar = new ex.a();
                                file = new File(c2031a.getAbsolutePath());
                                strA = this.fileConverter.a(file);
                                c cVar = this.imageConverter;
                                Uri uri = Uri.parse(strA);
                                c1026a.f44999d = c2031a;
                                c1026a.f45000e = bVar;
                                c1026a.f45001f = jVarA;
                                c1026a.f45002g = vq.j.a(aVar);
                                c1026a.f45003h = aVar;
                                c1026a.f45004j = vq.j.a(file);
                                c1026a.f45005k = strA;
                                c1026a.f45006l = aVar;
                                i15 = 0;
                                c1026a.f45010q = 0;
                                c1026a.f45011r = 0;
                                c1026a.f45012s = 0;
                                c1026a.f45013t = 0;
                                c1026a.f45014v = 0;
                                c1026a.A = 1;
                                Object objG = cVar.g(uri, c1026a);
                                if (objG != objE) {
                                    obj = objG;
                                    bVar2 = aVar;
                                    c2031a2 = c2031a;
                                    bVar3 = bVar;
                                    i16 = 0;
                                    i17 = 0;
                                    i18 = 0;
                                    bVar4 = bVar2;
                                    bVar5 = bVar4;
                                    i19 = 0;
                                    r16 = jVarA;
                                }
                                return objE;
                            }
                            if (i45 == 1) {
                                int i46 = c1026a.f45014v;
                                i16 = c1026a.f45013t;
                                int i47 = c1026a.f45012s;
                                int i48 = c1026a.f45011r;
                                int i49 = c1026a.f45010q;
                                ex.b bVar9 = (ex.b) c1026a.f45006l;
                                String str3 = (String) c1026a.f45005k;
                                file = (File) c1026a.f45004j;
                                ex.b bVar10 = (ex.b) c1026a.f45003h;
                                ex.b bVar11 = (ex.b) c1026a.f45002g;
                                j jVar = (j) c1026a.f45001f;
                                bVar3 = (hw3.a.Requirements) c1026a.f45000e;
                                c2031a2 = (hw3.a.PhotoData) c1026a.f44999d;
                                try {
                                    u.b(objC);
                                    i15 = i46;
                                    strA = str3;
                                    bVar4 = bVar9;
                                    i19 = i49;
                                    i18 = i48;
                                    i17 = i47;
                                    r16 = jVar;
                                    bVar2 = bVar10;
                                    bVar5 = bVar11;
                                    obj = objC;
                                } catch (ex.c e15) {
                                    e = e15;
                                    return new i.Left((b) ex.d.a(e));
                                } catch (CancellationException e16) {
                                    throw e16;
                                } catch (Exception e17) {
                                    e = e17;
                                    r16 = jVar;
                                    f fVar = f.f163100a;
                                    message = e.getMessage();
                                    if (message == null) {
                                        message = "";
                                    }
                                    fVar.d(message, e, px.c.a(r16));
                                    iVarA = r16.a(e);
                                    if (iVarA instanceof i.Left) {
                                        objB = new b.Generic((Exception) ((i.Left) iVarA).b());
                                    } else {
                                        if (!(iVarA instanceof i.Right)) {
                                            throw new p();
                                        }
                                        objB = ((i.Right) iVarA).b();
                                    }
                                    return new i.Left(objB);
                                }
                            } else {
                                if (i45 != 2) {
                                    if (i45 == 3) {
                                        float f19 = c1026a.f45016x;
                                        float f25 = c1026a.f45015w;
                                        i28 = c1026a.f45014v;
                                        int i55 = c1026a.f45013t;
                                        int i56 = c1026a.f45012s;
                                        int i57 = c1026a.f45011r;
                                        int i58 = c1026a.f45010q;
                                        Bitmap bitmap5 = (Bitmap) c1026a.f45008n;
                                        Bitmap bitmap6 = (Bitmap) c1026a.f45007m;
                                        ex.b bVar12 = (ex.b) c1026a.f45006l;
                                        String str4 = (String) c1026a.f45005k;
                                        File file3 = (File) c1026a.f45004j;
                                        ex.b bVar13 = (ex.b) c1026a.f45003h;
                                        ex.b bVar14 = (ex.b) c1026a.f45002g;
                                        j jVar2 = (j) c1026a.f45001f;
                                        hw3.a.Requirements bVar15 = (hw3.a.Requirements) c1026a.f45000e;
                                        hw3.a.PhotoData c2031a5 = (hw3.a.PhotoData) c1026a.f44999d;
                                        try {
                                            u.b(objC);
                                            bVar6 = bVar14;
                                            f17 = f19;
                                            file2 = file3;
                                            str2 = str4;
                                            c2031a2 = c2031a5;
                                            obj3 = objE;
                                            bVar7 = bVar12;
                                            bVar3 = bVar15;
                                            bVar8 = bVar13;
                                            obj4 = objC;
                                            bitmap4 = bitmap5;
                                            i36 = i57;
                                            i38 = i55;
                                            f18 = f25;
                                            r15 = jVar2;
                                            bitmap3 = bitmap6;
                                            i35 = i58;
                                            i37 = i56;
                                            int i59 = i28;
                                            try {
                                                Bitmap bitmap7 = (Bitmap) bVar7.a((i) obj4);
                                                g2.j(c1026a.getContext());
                                                hw3.a.Requirements bVar16 = bVar3;
                                                c cVar2 = this.imageConverter;
                                                float fA = bVar16.getMaxSize();
                                                c1026a.f44999d = c2031a2;
                                                c2031a3 = c2031a2;
                                                c1026a.f45000e = vq.j.a(bVar16);
                                                c1026a.f45001f = r15;
                                                c1026a.f45002g = vq.j.a(bVar6);
                                                c1026a.f45003h = vq.j.a(bVar8);
                                                c1026a.f45004j = vq.j.a(file2);
                                                c1026a.f45005k = str2;
                                                c1026a.f45006l = bVar8;
                                                c1026a.f45007m = vq.j.a(bitmap3);
                                                c1026a.f45008n = vq.j.a(bitmap4);
                                                c1026a.f45009p = vq.j.a(bitmap7);
                                                c1026a.f45010q = i35;
                                                c1026a.f45011r = i36;
                                                c1026a.f45012s = i37;
                                                c1026a.f45013t = i38;
                                                c1026a.f45014v = i59;
                                                c1026a.f45015w = f18;
                                                c1026a.f45016x = f17;
                                                c1026a.A = 4;
                                                objC = cVar2.c(bitmap7, fA, c1026a);
                                                if (objC == obj3) {
                                                    return obj3;
                                                }
                                                c2031a4 = c2031a3;
                                            } catch (ex.c e18) {
                                                e = e18;
                                                return new i.Left((b) ex.d.a(e));
                                            } catch (CancellationException e19) {
                                                throw e19;
                                            } catch (Exception e25) {
                                                e = e25;
                                                r16 = r15;
                                                f fVar2 = f.f163100a;
                                                message = e.getMessage();
                                                if (message == null) {
                                                    message = "";
                                                }
                                                fVar2.d(message, e, px.c.a(r16));
                                                iVarA = r16.a(e);
                                                if (iVarA instanceof i.Left) {
                                                    objB = new b.Generic((Exception) ((i.Left) iVarA).b());
                                                } else {
                                                    if (!(iVarA instanceof i.Right)) {
                                                        throw new p();
                                                    }
                                                    objB = ((i.Right) iVarA).b();
                                                }
                                                return new i.Left(objB);
                                            }
                                        } catch (ex.c e26) {
                                            e = e26;
                                            return new i.Left((b) ex.d.a(e));
                                        } catch (CancellationException e27) {
                                            throw e27;
                                        } catch (Exception e28) {
                                            e = e28;
                                            r16 = jVar2;
                                            f fVar3 = f.f163100a;
                                            message = e.getMessage();
                                            if (message == null) {
                                                message = "";
                                            }
                                            fVar3.d(message, e, px.c.a(r16));
                                            iVarA = r16.a(e);
                                            if (iVarA instanceof i.Left) {
                                                objB = new b.Generic((Exception) ((i.Left) iVarA).b());
                                            } else {
                                                if (!(iVarA instanceof i.Right)) {
                                                    throw new p();
                                                }
                                                objB = ((i.Right) iVarA).b();
                                            }
                                            return new i.Left(objB);
                                        }
                                    } else {
                                        if (i45 != 4) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        bVar8 = (ex.b) c1026a.f45006l;
                                        str2 = (String) c1026a.f45005k;
                                        c2031a4 = (hw3.a.PhotoData) c1026a.f44999d;
                                        u.b(objC);
                                    }
                                    byte[] bArr = (byte[]) bVar8.a((i) objC);
                                    return new i.Right(new wx.i.Image(new FilePickerMetadata(c2031a4.getFileName(), c2031a4.getExtension(), bArr.length, str2), new FileContent(bArr)));
                                }
                                float f26 = c1026a.f45016x;
                                float f27 = c1026a.f45015w;
                                int i65 = c1026a.f45014v;
                                int i66 = c1026a.f45013t;
                                int i67 = c1026a.f45012s;
                                int i68 = c1026a.f45011r;
                                int i69 = c1026a.f45010q;
                                Bitmap bitmap8 = (Bitmap) c1026a.f45007m;
                                bVar2 = (ex.b) c1026a.f45006l;
                                String str5 = (String) c1026a.f45005k;
                                File file4 = (File) c1026a.f45004j;
                                ex.b bVar17 = (ex.b) c1026a.f45003h;
                                ex.b bVar18 = (ex.b) c1026a.f45002g;
                                j jVar3 = (j) c1026a.f45001f;
                                hw3.a.Requirements bVar19 = (hw3.a.Requirements) c1026a.f45000e;
                                hw3.a.PhotoData c2031a6 = (hw3.a.PhotoData) c1026a.f44999d;
                                u.b(objC);
                                str = str5;
                                bVar3 = bVar19;
                                file2 = file4;
                                c2031a2 = c2031a6;
                                bVar7 = bVar17;
                                f15 = f27;
                                f16 = f26;
                                obj2 = objC;
                                bitmap = bitmap8;
                                i29 = i69;
                                i27 = i68;
                                i25 = i67;
                                i26 = i66;
                                i28 = i65;
                                r16 = jVar3;
                                bVar6 = bVar18;
                                try {
                                    bitmap2 = (Bitmap) bVar2.a((i) obj2);
                                    g2.j(c1026a.getContext());
                                    Object obj5 = objE;
                                    c cVar3 = this.imageConverter;
                                    b00.f.Crop crop = new b00.f.Crop((bitmap2.getWidth() - bVar3.getTargetWidth()) / 2, (bitmap2.getHeight() - bVar3.getTargetHeight()) / 2, bVar3.getTargetWidth(), bVar3.getTargetHeight(), null, 16, null);
                                    c1026a.f44999d = c2031a2;
                                    c1026a.f45000e = bVar3;
                                    c1026a.f45001f = r16;
                                    r18 = r16;
                                    try {
                                        c1026a.f45002g = vq.j.a(bVar6);
                                        c1026a.f45003h = bVar7;
                                        c1026a.f45004j = vq.j.a(file2);
                                        c1026a.f45005k = str;
                                        c1026a.f45006l = bVar7;
                                        c1026a.f45007m = vq.j.a(bitmap);
                                        c1026a.f45008n = vq.j.a(bitmap2);
                                        c1026a.f45010q = i29;
                                        c1026a.f45011r = i27;
                                        c1026a.f45012s = i25;
                                        c1026a.f45013t = i26;
                                        c1026a.f45014v = i28;
                                        c1026a.f45015w = f15;
                                        c1026a.f45016x = f16;
                                        c1026a.A = 3;
                                        objF = cVar3.f(bitmap2, crop, c1026a);
                                        obj3 = obj5;
                                        if (objF == obj3) {
                                            return obj3;
                                        }
                                        float f28 = f16;
                                        str2 = str;
                                        f17 = f28;
                                        obj4 = objF;
                                        i35 = i29;
                                        bitmap3 = bitmap;
                                        bVar8 = bVar7;
                                        bitmap4 = bitmap2;
                                        i36 = i27;
                                        f18 = f15;
                                        i37 = i25;
                                        r15 = r18;
                                        i38 = i26;
                                        int i510 = i28;
                                        Bitmap bitmap9 = (Bitmap) bVar7.a((i) obj4);
                                        g2.j(c1026a.getContext());
                                        hw3.a.Requirements bVar110 = bVar3;
                                        c cVar4 = this.imageConverter;
                                        float fA2 = bVar110.getMaxSize();
                                        c1026a.f44999d = c2031a2;
                                        c2031a3 = c2031a2;
                                        c1026a.f45000e = vq.j.a(bVar110);
                                        c1026a.f45001f = r15;
                                        c1026a.f45002g = vq.j.a(bVar6);
                                        c1026a.f45003h = vq.j.a(bVar8);
                                        c1026a.f45004j = vq.j.a(file2);
                                        c1026a.f45005k = str2;
                                        c1026a.f45006l = bVar8;
                                        c1026a.f45007m = vq.j.a(bitmap3);
                                        c1026a.f45008n = vq.j.a(bitmap4);
                                        c1026a.f45009p = vq.j.a(bitmap9);
                                        c1026a.f45010q = i35;
                                        c1026a.f45011r = i36;
                                        c1026a.f45012s = i37;
                                        c1026a.f45013t = i38;
                                        c1026a.f45014v = i510;
                                        c1026a.f45015w = f18;
                                        c1026a.f45016x = f17;
                                        c1026a.A = 4;
                                        objC = cVar4.c(bitmap9, fA2, c1026a);
                                        if (objC == obj3) {
                                            return obj3;
                                        }
                                        c2031a4 = c2031a3;
                                        byte[] bArr2 = (byte[]) bVar8.a((i) objC);
                                        return new i.Right(new wx.i.Image(new FilePickerMetadata(c2031a4.getFileName(), c2031a4.getExtension(), bArr2.length, str2), new FileContent(bArr2)));
                                    } catch (ex.c e29) {
                                        e = e29;
                                        return new i.Left((b) ex.d.a(e));
                                    } catch (CancellationException e35) {
                                        throw e35;
                                    } catch (Exception e36) {
                                        e = e36;
                                        r16 = r18;
                                        f fVar4 = f.f163100a;
                                        message = e.getMessage();
                                        if (message == null) {
                                            message = "";
                                        }
                                        fVar4.d(message, e, px.c.a(r16));
                                        iVarA = r16.a(e);
                                        if (iVarA instanceof i.Left) {
                                            objB = new b.Generic((Exception) ((i.Left) iVarA).b());
                                        } else {
                                            if (!(iVarA instanceof i.Right)) {
                                                throw new p();
                                            }
                                            objB = ((i.Right) iVarA).b();
                                        }
                                        return new i.Left(objB);
                                    }
                                } catch (ex.c e37) {
                                    e = e37;
                                } catch (CancellationException e38) {
                                    throw e38;
                                } catch (Exception e39) {
                                    e = e39;
                                }
                            }
                            Bitmap bitmap10 = (Bitmap) bVar4.a((i) obj);
                            g2.j(c1026a.getContext());
                            float fC = bVar3.getTargetWidth() / bitmap10.getWidth();
                            ex.b bVar20 = bVar5;
                            float fB = bVar3.getTargetHeight() / bitmap10.getHeight();
                            c cVar5 = this.imageConverter;
                            float fMax = Math.max(fC, fB);
                            c1026a.f44999d = c2031a2;
                            c1026a.f45000e = bVar3;
                            c1026a.f45001f = r16;
                            ?? r19 = r16;
                            c1026a.f45002g = vq.j.a(bVar20);
                            c1026a.f45003h = bVar2;
                            c1026a.f45004j = vq.j.a(file2);
                            c1026a.f45005k = strA;
                            c1026a.f45006l = bVar2;
                            c1026a.f45007m = vq.j.a(bitmap10);
                            c1026a.f45010q = i19;
                            c1026a.f45011r = i18;
                            c1026a.f45012s = i17;
                            c1026a.f45013t = i16;
                            c1026a.f45014v = i15;
                            c1026a.f45015w = fC;
                            c1026a.f45016x = fB;
                            c1026a.A = 2;
                            Object objD = cVar5.d(bitmap10, fMax, c1026a);
                            objE = objE;
                            if (objD != objE) {
                                i25 = i17;
                                f15 = fC;
                                bitmap = bitmap10;
                                r16 = r19;
                                bVar6 = bVar20;
                                obj2 = objD;
                                i26 = i16;
                                f16 = fB;
                                str = strA;
                                i27 = i18;
                                i28 = i15;
                                bVar7 = bVar2;
                                i29 = i19;
                                bitmap2 = (Bitmap) bVar2.a((i) obj2);
                                g2.j(c1026a.getContext());
                                Object obj6 = objE;
                                c cVar6 = this.imageConverter;
                                b00.f.Crop crop2 = new b00.f.Crop((bitmap2.getWidth() - bVar3.getTargetWidth()) / 2, (bitmap2.getHeight() - bVar3.getTargetHeight()) / 2, bVar3.getTargetWidth(), bVar3.getTargetHeight(), null, 16, null);
                                c1026a.f44999d = c2031a2;
                                c1026a.f45000e = bVar3;
                                c1026a.f45001f = r16;
                                r18 = r16;
                                c1026a.f45002g = vq.j.a(bVar6);
                                c1026a.f45003h = bVar7;
                                c1026a.f45004j = vq.j.a(file2);
                                c1026a.f45005k = str;
                                c1026a.f45006l = bVar7;
                                c1026a.f45007m = vq.j.a(bitmap);
                                c1026a.f45008n = vq.j.a(bitmap2);
                                c1026a.f45010q = i29;
                                c1026a.f45011r = i27;
                                c1026a.f45012s = i25;
                                c1026a.f45013t = i26;
                                c1026a.f45014v = i28;
                                c1026a.f45015w = f15;
                                c1026a.f45016x = f16;
                                c1026a.A = 3;
                                objF = cVar6.f(bitmap2, crop2, c1026a);
                                obj3 = obj6;
                                if (objF == obj3) {
                                    return obj3;
                                }
                                float f29 = f16;
                                str2 = str;
                                f17 = f29;
                                obj4 = objF;
                                i35 = i29;
                                bitmap3 = bitmap;
                                bVar8 = bVar7;
                                bitmap4 = bitmap2;
                                i36 = i27;
                                f18 = f15;
                                i37 = i25;
                                r15 = r18;
                                i38 = i26;
                                int i511 = i28;
                                Bitmap bitmap11 = (Bitmap) bVar7.a((i) obj4);
                                g2.j(c1026a.getContext());
                                hw3.a.Requirements bVar111 = bVar3;
                                c cVar7 = this.imageConverter;
                                float fA3 = bVar111.getMaxSize();
                                c1026a.f44999d = c2031a2;
                                c2031a3 = c2031a2;
                                c1026a.f45000e = vq.j.a(bVar111);
                                c1026a.f45001f = r15;
                                c1026a.f45002g = vq.j.a(bVar6);
                                c1026a.f45003h = vq.j.a(bVar8);
                                c1026a.f45004j = vq.j.a(file2);
                                c1026a.f45005k = str2;
                                c1026a.f45006l = bVar8;
                                c1026a.f45007m = vq.j.a(bitmap3);
                                c1026a.f45008n = vq.j.a(bitmap4);
                                c1026a.f45009p = vq.j.a(bitmap11);
                                c1026a.f45010q = i35;
                                c1026a.f45011r = i36;
                                c1026a.f45012s = i37;
                                c1026a.f45013t = i38;
                                c1026a.f45014v = i511;
                                c1026a.f45015w = f18;
                                c1026a.f45016x = f17;
                                c1026a.A = 4;
                                objC = cVar7.c(bitmap11, fA3, c1026a);
                                if (objC == obj3) {
                                    return obj3;
                                }
                                c2031a4 = c2031a3;
                                byte[] bArr3 = (byte[]) bVar8.a((i) objC);
                                return new i.Right(new wx.i.Image(new FilePickerMetadata(c2031a4.getFileName(), c2031a4.getExtension(), bArr3.length, str2), new FileContent(bArr3)));
                            }
                            return objE;
                        } catch (ex.c e45) {
                            e = e45;
                            return new i.Left((b) ex.d.a(e));
                        } catch (CancellationException e46) {
                            throw e46;
                        } catch (Exception e47) {
                            e = e47;
                            f fVar5 = f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar5.d(message, e, px.c.a(r16));
                            iVarA = r16.a(e);
                            if (iVarA instanceof i.Left) {
                                objB = new b.Generic((Exception) ((i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof i.Right)) {
                                    throw new p();
                                }
                                objB = ((i.Right) iVarA).b();
                            }
                            return new i.Left(objB);
                        }
                        file2 = file;
                    } catch (CancellationException e48) {
                        throw e48;
                    }
                } catch (Exception e49) {
                    e = e49;
                }
            } catch (ex.c e55) {
                e = e55;
            } catch (CancellationException e56) {
                throw e56;
            }
        } catch (ex.c e57) {
            e = e57;
        } catch (CancellationException e58) {
            throw e58;
        } catch (Exception e59) {
            e = e59;
            r16 = bVar6;
        }
    }
}
