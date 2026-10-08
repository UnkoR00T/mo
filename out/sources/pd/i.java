package pd;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import fd.g0;
import id.o;
import id.t;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nd.k;
import nd.l;
import nd.m;
import od.q;
import od.u;
import r0.a0;

/* JADX INFO: loaded from: classes3.dex */
public class i extends pd.b {
    private final StringBuilder E;
    private final StringBuilder F;
    private final StringBuilder G;
    private final StringBuilder H;
    private final RectF I;
    private final Matrix J;
    private final Paint K;
    private final Paint L;
    private final Map<md.d, List<hd.d>> M;
    private final a0<String> N;
    private final List<String> O;
    private final List<d> P;
    private final o Q;
    private final fd.a0 R;
    private final fd.f S;
    private u T;
    private id.a<Integer, Integer> U;
    private id.a<Integer, Integer> V;
    private id.a<Integer, Integer> W;
    private id.a<Integer, Integer> X;
    private id.a<Float, Float> Y;
    private id.a<Float, Float> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private id.a<Float, Float> f156977a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private id.a<Float, Float> f156978b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private id.a<Integer, Integer> f156979c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private id.a<Float, Float> f156980d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private id.a<Typeface, Typeface> f156981e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private id.a<Integer, Integer> f156982f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private id.a<Integer, Integer> f156983g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private id.a<Integer, Integer> f156984h0;

    class a extends Paint {
        a(int i15) {
            super(i15);
            setStyle(Paint.Style.FILL);
        }
    }

    class b extends Paint {
        b(int i15) {
            super(i15);
            setStyle(Paint.Style.STROKE);
        }
    }

    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f156987a;

        static {
            int[] iArr = new int[md.b.a.values().length];
            f156987a = iArr;
            try {
                iArr[md.b.a.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f156987a[md.b.a.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f156987a[md.b.a.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    i(fd.a0 a0Var, e eVar) {
        l lVar;
        l lVar2;
        nd.d dVar;
        l lVar3;
        nd.d dVar2;
        l lVar4;
        nd.d dVar3;
        m mVar;
        nd.d dVar4;
        m mVar2;
        nd.b bVar;
        m mVar3;
        nd.b bVar2;
        m mVar4;
        nd.a aVar;
        m mVar5;
        nd.a aVar2;
        super(a0Var, eVar);
        this.E = new StringBuilder(2);
        this.F = new StringBuilder(0);
        this.G = new StringBuilder(0);
        this.H = new StringBuilder(0);
        this.I = new RectF();
        this.J = new Matrix();
        this.K = new a(1);
        this.L = new b(1);
        this.M = new HashMap();
        this.N = new a0<>();
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.T = u.INDEX;
        this.R = a0Var;
        this.S = eVar.c();
        o oVarL = eVar.t().l();
        this.Q = oVarL;
        oVarL.a(this);
        j(oVarL);
        k kVarU = eVar.u();
        if (kVarU != null && (mVar5 = kVarU.f134243a) != null && (aVar2 = mVar5.f134249a) != null) {
            id.a<Integer, Integer> aVarL = aVar2.l();
            this.U = aVarL;
            aVarL.a(this);
            j(this.U);
        }
        if (kVarU != null && (mVar4 = kVarU.f134243a) != null && (aVar = mVar4.f134250b) != null) {
            id.a<Integer, Integer> aVarL2 = aVar.l();
            this.W = aVarL2;
            aVarL2.a(this);
            j(this.W);
        }
        if (kVarU != null && (mVar3 = kVarU.f134243a) != null && (bVar2 = mVar3.f134251c) != null) {
            id.d dVarL = bVar2.l();
            this.Y = dVarL;
            dVarL.a(this);
            j(this.Y);
        }
        if (kVarU != null && (mVar2 = kVarU.f134243a) != null && (bVar = mVar2.f134252d) != null) {
            id.d dVarL2 = bVar.l();
            this.f156977a0 = dVarL2;
            dVarL2.a(this);
            j(this.f156977a0);
        }
        if (kVarU != null && (mVar = kVarU.f134243a) != null && (dVar4 = mVar.f134253e) != null) {
            id.a<Integer, Integer> aVarL3 = dVar4.l();
            this.f156979c0 = aVarL3;
            aVarL3.a(this);
            j(this.f156979c0);
        }
        if (kVarU != null && (lVar4 = kVarU.f134244b) != null && (dVar3 = lVar4.f134245a) != null) {
            id.a<Integer, Integer> aVarL4 = dVar3.l();
            this.f156982f0 = aVarL4;
            aVarL4.a(this);
            j(this.f156982f0);
        }
        if (kVarU != null && (lVar3 = kVarU.f134244b) != null && (dVar2 = lVar3.f134246b) != null) {
            id.a<Integer, Integer> aVarL5 = dVar2.l();
            this.f156983g0 = aVarL5;
            aVarL5.a(this);
            j(this.f156983g0);
        }
        if (kVarU != null && (lVar2 = kVarU.f134244b) != null && (dVar = lVar2.f134247c) != null) {
            id.a<Integer, Integer> aVarL6 = dVar.l();
            this.f156984h0 = aVarL6;
            aVarL6.a(this);
            j(this.f156984h0);
        }
        if (kVarU == null || (lVar = kVarU.f134244b) == null) {
            return;
        }
        this.T = lVar.f134248d;
    }

    private String P(String str, int i15) {
        int iCodePointAt = str.codePointAt(i15);
        int iCharCount = Character.charCount(iCodePointAt) + i15;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (!g0(iCodePointAt2)) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j15 = iCodePointAt;
        if (this.N.e(j15)) {
            return this.N.g(j15);
        }
        this.E.setLength(0);
        while (i15 < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i15);
            this.E.appendCodePoint(iCodePointAt3);
            i15 += Character.charCount(iCodePointAt3);
        }
        String string = this.E.toString();
        this.N.m(j15, string);
        return string;
    }

    private void Q(md.b bVar, int i15, int i16) {
        id.a<Integer, Integer> aVar = this.V;
        if (aVar != null) {
            this.K.setColor(aVar.h().intValue());
        } else if (this.U == null || !e0(i16)) {
            this.K.setColor(bVar.f125617h);
        } else {
            this.K.setColor(this.U.h().intValue());
        }
        id.a<Integer, Integer> aVar2 = this.X;
        if (aVar2 != null) {
            this.L.setColor(aVar2.h().intValue());
        } else if (this.W == null || !e0(i16)) {
            this.L.setColor(bVar.f125618i);
        } else {
            this.L.setColor(this.W.h().intValue());
        }
        int iIntValue = 100;
        int iIntValue2 = this.f156931x.k() == null ? 100 : this.f156931x.k().h().intValue();
        if (this.f156979c0 != null && e0(i16)) {
            iIntValue = this.f156979c0.h().intValue();
        }
        int iRound = Math.round(((((iIntValue2 * 255.0f) / 100.0f) * (iIntValue / 100.0f)) * i15) / 255.0f);
        this.K.setAlpha(iRound);
        this.L.setAlpha(iRound);
        id.a<Float, Float> aVar3 = this.Z;
        if (aVar3 != null) {
            this.L.setStrokeWidth(aVar3.h().floatValue());
        } else if (this.Y == null || !e0(i16)) {
            this.L.setStrokeWidth(bVar.f125619j * td.m.e());
        } else {
            this.L.setStrokeWidth(this.Y.h().floatValue());
        }
    }

    private void R(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private void S(md.d dVar, float f15, md.b bVar, Canvas canvas, int i15, int i16) {
        Q(bVar, i16, i15);
        List<hd.d> listB0 = b0(dVar);
        for (int i17 = 0; i17 < listB0.size(); i17++) {
            Path pathW = listB0.get(i17).W();
            pathW.computeBounds(this.I, false);
            this.J.reset();
            this.J.preTranslate(0.0f, (-bVar.f125616g) * td.m.e());
            this.J.preScale(f15, f15);
            pathW.transform(this.J);
            if (bVar.f125620k) {
                V(pathW, this.K, canvas);
                V(pathW, this.L, canvas);
            } else {
                V(pathW, this.L, canvas);
                V(pathW, this.K, canvas);
            }
        }
    }

    private void T(String str, md.b bVar, Canvas canvas, int i15, int i16) {
        Q(bVar, i16, i15);
        if (bVar.f125620k) {
            R(str, this.K, canvas);
            R(str, this.L, canvas);
        } else {
            R(str, this.L, canvas);
            R(str, this.K, canvas);
        }
    }

    private void U(String str, md.b bVar, Canvas canvas, float f15, int i15, int i16) {
        this.O.clear();
        int length = 0;
        while (length < str.length()) {
            String strP = P(str, length);
            this.O.add(strP);
            length += strP.length();
        }
        int i17 = 0;
        while (i17 < this.O.size()) {
            this.F.setLength(0);
            this.F.append(this.O.get(i17));
            int i18 = i17 + 1;
            while (i18 < this.O.size()) {
                String str2 = this.O.get(i18);
                if (!f0(str2)) {
                    break;
                }
                this.F.insert(0, str2);
                i18++;
            }
            String string = this.F.toString();
            md.b bVar2 = bVar;
            T(string, bVar2, canvas, i15 + i17, i16);
            canvas.translate(this.K.measureText(string) + f15, 0.0f);
            i17 = i18;
            bVar = bVar2;
        }
    }

    private void V(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void X(String str, md.b bVar, md.c cVar, Canvas canvas, float f15, float f16, float f17, int i15) {
        md.b bVar2;
        Canvas canvas2;
        float f18;
        int i16;
        int i17 = 0;
        while (i17 < str.length()) {
            md.d dVarI = this.S.c().i(md.d.c(str.charAt(i17), cVar.a(), cVar.c()));
            if (dVarI == null) {
                bVar2 = bVar;
                canvas2 = canvas;
                f18 = f16;
                i16 = i15;
            } else {
                bVar2 = bVar;
                canvas2 = canvas;
                f18 = f16;
                i16 = i15;
                S(dVarI, f18, bVar2, canvas2, i17, i16);
                canvas2.translate((((float) dVarI.b()) * f18 * td.m.e()) + f17, 0.0f);
            }
            i17++;
            f16 = f18;
            bVar = bVar2;
            canvas = canvas2;
            i15 = i16;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0088  */
    /* JADX WARN: Code duplicated, block: B:20:0x0092  */
    /* JADX WARN: Code duplicated, block: B:22:0x0095  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f5  */
    private void Y(md.b bVar, md.c cVar, Canvas canvas, int i15) {
        float fFloatValue;
        float fE;
        List<String> listC0;
        int size;
        int i16;
        int i17;
        int length;
        PointF pointF;
        float f15;
        float f16;
        List<d> listJ0;
        int i18;
        d dVar;
        float fMeasureText;
        float f17;
        int i19;
        String strI0;
        i iVar = this;
        md.b bVar2 = bVar;
        md.c cVar2 = cVar;
        Typeface typefaceD0 = iVar.d0(cVar2);
        if (typefaceD0 == null) {
            return;
        }
        String str = bVar2.f125610a;
        iVar.R.M();
        iVar.K.setTypeface(typefaceD0);
        id.a<Float, Float> aVar = iVar.f156980d0;
        float fFloatValue2 = aVar != null ? aVar.h().floatValue() : bVar2.f125612c;
        iVar.K.setTextSize(td.m.e() * fFloatValue2);
        iVar.L.setTypeface(iVar.K.getTypeface());
        iVar.L.setTextSize(iVar.K.getTextSize());
        float f18 = bVar2.f125614e / 10.0f;
        id.a<Float, Float> aVar2 = iVar.f156978b0;
        if (aVar2 == null) {
            id.a<Float, Float> aVar3 = iVar.f156977a0;
            if (aVar3 != null) {
                fFloatValue = aVar3.h().floatValue();
            }
            fE = ((f18 * td.m.e()) * fFloatValue2) / 100.0f;
            listC0 = iVar.c0(str);
            size = listC0.size();
            i16 = -1;
            i17 = 0;
            length = 0;
            while (i17 < size) {
                String str2 = listC0.get(i17);
                pointF = bVar2.f125622m;
                if (pointF == null) {
                    f15 = 0.0f;
                } else {
                    f15 = pointF.x;
                }
                f16 = fE;
                listJ0 = iVar.j0(str2, f15, cVar2, 0.0f, f16, false);
                i18 = 0;
                while (i18 < listJ0.size()) {
                    dVar = listJ0.get(i18);
                    i16++;
                    canvas.save();
                    if (iVar.Q != null && iVar.f156980d0 == null && iVar.f156978b0 == null) {
                        fMeasureText = dVar.f156989b;
                    } else {
                        fMeasureText = iVar.K.measureText(dVar.f156988a);
                    }
                    if (iVar.h0(canvas, bVar2, i16, fMeasureText)) {
                        strI0 = dVar.f156988a;
                        if (Bidi.requiresBidi(strI0.toCharArray(), 0, strI0.length())) {
                            strI0 = iVar.i0(strI0);
                        }
                        f17 = f16;
                        i19 = length;
                        iVar.U(strI0, bVar2, canvas, f17, i19, i15);
                    } else {
                        f17 = f16;
                        i19 = length;
                    }
                    length = i19 + dVar.f156988a.length();
                    canvas.restore();
                    i18++;
                    iVar = this;
                    bVar2 = bVar;
                    f16 = f17;
                }
                fE = f16;
                i17++;
                iVar = this;
                bVar2 = bVar;
                cVar2 = cVar;
            }
        }
        fFloatValue = aVar2.h().floatValue();
        f18 += fFloatValue;
        fE = ((f18 * td.m.e()) * fFloatValue2) / 100.0f;
        listC0 = iVar.c0(str);
        size = listC0.size();
        i16 = -1;
        i17 = 0;
        length = 0;
        while (i17 < size) {
            String str3 = listC0.get(i17);
            pointF = bVar2.f125622m;
            if (pointF == null) {
                f15 = 0.0f;
            } else {
                f15 = pointF.x;
            }
            f16 = fE;
            listJ0 = iVar.j0(str3, f15, cVar2, 0.0f, f16, false);
            i18 = 0;
            while (i18 < listJ0.size()) {
                dVar = listJ0.get(i18);
                i16++;
                canvas.save();
                if (iVar.Q != null) {
                    fMeasureText = iVar.K.measureText(dVar.f156988a);
                } else {
                    fMeasureText = iVar.K.measureText(dVar.f156988a);
                }
                if (iVar.h0(canvas, bVar2, i16, fMeasureText)) {
                    strI0 = dVar.f156988a;
                    if (Bidi.requiresBidi(strI0.toCharArray(), 0, strI0.length())) {
                        strI0 = iVar.i0(strI0);
                    }
                    f17 = f16;
                    i19 = length;
                    iVar.U(strI0, bVar2, canvas, f17, i19, i15);
                } else {
                    f17 = f16;
                    i19 = length;
                }
                length = i19 + dVar.f156988a.length();
                canvas.restore();
                i18++;
                iVar = this;
                bVar2 = bVar;
                f16 = f17;
            }
            fE = f16;
            i17++;
            iVar = this;
            bVar2 = bVar;
            cVar2 = cVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0053  */
    /* JADX WARN: Code duplicated, block: B:18:0x005d  */
    /* JADX WARN: Code duplicated, block: B:19:0x005f  */
    /* JADX WARN: Code duplicated, block: B:23:0x006f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0086  */
    /* JADX WARN: Code duplicated, block: B:26:0x0098  */
    private void Z(md.b bVar, Matrix matrix, md.c cVar, Canvas canvas, int i15) {
        float fFloatValue;
        float f15;
        int i16;
        int i17;
        PointF pointF;
        float f16;
        List<d> listJ0;
        int i18;
        d dVar;
        float f17;
        float f18;
        i iVar = this;
        md.b bVar2 = bVar;
        id.a<Float, Float> aVar = iVar.f156980d0;
        float fFloatValue2 = (aVar != null ? aVar.h().floatValue() : bVar2.f125612c) / 100.0f;
        float fG = td.m.g(matrix);
        List<String> listC0 = iVar.c0(bVar2.f125610a);
        int size = listC0.size();
        float f19 = bVar2.f125614e / 10.0f;
        id.a<Float, Float> aVar2 = iVar.f156978b0;
        if (aVar2 == null) {
            id.a<Float, Float> aVar3 = iVar.f156977a0;
            if (aVar3 != null) {
                fFloatValue = aVar3.h().floatValue();
            }
            f15 = f19;
            i16 = -1;
            i17 = 0;
            while (i17 < size) {
                String str = listC0.get(i17);
                pointF = bVar2.f125622m;
                if (pointF == null) {
                    f16 = 0.0f;
                } else {
                    f16 = pointF.x;
                }
                listJ0 = iVar.j0(str, f16, cVar, fFloatValue2, f15, true);
                i18 = 0;
                while (i18 < listJ0.size()) {
                    dVar = listJ0.get(i18);
                    i16++;
                    canvas.save();
                    if (iVar.h0(canvas, bVar2, i16, dVar.f156989b)) {
                        float f25 = fFloatValue2;
                        md.b bVar3 = bVar2;
                        f17 = f15;
                        f18 = fG;
                        iVar.X(dVar.f156988a, bVar3, cVar, canvas, f18, f25, f17, i15);
                        fFloatValue2 = f25;
                    } else {
                        f17 = f15;
                        f18 = fG;
                    }
                    canvas.restore();
                    i18++;
                    iVar = this;
                    fG = f18;
                    f15 = f17;
                    bVar2 = bVar;
                }
                i17++;
                iVar = this;
                f15 = f15;
                bVar2 = bVar;
            }
        }
        fFloatValue = aVar2.h().floatValue();
        f19 += fFloatValue;
        f15 = f19;
        i16 = -1;
        i17 = 0;
        while (i17 < size) {
            String str2 = listC0.get(i17);
            pointF = bVar2.f125622m;
            if (pointF == null) {
                f16 = 0.0f;
            } else {
                f16 = pointF.x;
            }
            listJ0 = iVar.j0(str2, f16, cVar, fFloatValue2, f15, true);
            i18 = 0;
            while (i18 < listJ0.size()) {
                dVar = listJ0.get(i18);
                i16++;
                canvas.save();
                if (iVar.h0(canvas, bVar2, i16, dVar.f156989b)) {
                    float f26 = fFloatValue2;
                    md.b bVar4 = bVar2;
                    f17 = f15;
                    f18 = fG;
                    iVar.X(dVar.f156988a, bVar4, cVar, canvas, f18, f26, f17, i15);
                    fFloatValue2 = f26;
                } else {
                    f17 = f15;
                    f18 = fG;
                }
                canvas.restore();
                i18++;
                iVar = this;
                fG = f18;
                f15 = f17;
                bVar2 = bVar;
            }
            i17++;
            iVar = this;
            f15 = f15;
            bVar2 = bVar;
        }
    }

    private d a0(int i15) {
        for (int size = this.P.size(); size < i15; size++) {
            this.P.add(new d(null));
        }
        return this.P.get(i15 - 1);
    }

    private List<hd.d> b0(md.d dVar) {
        if (this.M.containsKey(dVar)) {
            return this.M.get(dVar);
        }
        List<q> listA = dVar.a();
        int size = listA.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i15 = 0; i15 < size; i15++) {
            arrayList.add(new hd.d(this.R, this, listA.get(i15), this.S));
        }
        this.M.put(dVar, arrayList);
        return arrayList;
    }

    private List<String> c0(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private Typeface d0(md.c cVar) {
        Typeface typefaceH;
        id.a<Typeface, Typeface> aVar = this.f156981e0;
        if (aVar != null && (typefaceH = aVar.h()) != null) {
            return typefaceH;
        }
        Typeface typefaceN = this.R.N(cVar);
        return typefaceN != null ? typefaceN : cVar.d();
    }

    private boolean e0(int i15) {
        int length = this.Q.h().f125610a.length();
        id.a<Integer, Integer> aVar = this.f156982f0;
        if (aVar == null || this.f156983g0 == null) {
            return true;
        }
        int iMin = Math.min(aVar.h().intValue(), this.f156983g0.h().intValue());
        int iMax = Math.max(this.f156982f0.h().intValue(), this.f156983g0.h().intValue());
        id.a<Integer, Integer> aVar2 = this.f156984h0;
        if (aVar2 != null) {
            int iIntValue = aVar2.h().intValue();
            iMin += iIntValue;
            iMax += iIntValue;
        }
        if (this.T == u.INDEX) {
            return i15 >= iMin && i15 < iMax;
        }
        float f15 = (i15 / length) * 100.0f;
        return f15 >= ((float) iMin) && f15 < ((float) iMax);
    }

    private boolean f0(String str) {
        for (int i15 = 0; i15 < str.length(); i15++) {
            if (Character.getDirectionality(str.codePointAt(i15)) == 2) {
                return true;
            }
        }
        return false;
    }

    private boolean g0(int i15) {
        return Character.getType(i15) == 16 || Character.getType(i15) == 27 || Character.getType(i15) == 6 || Character.getType(i15) == 28 || Character.getType(i15) == 8 || Character.getType(i15) == 19;
    }

    private boolean h0(Canvas canvas, md.b bVar, int i15, float f15) {
        PointF pointF = bVar.f125621l;
        PointF pointF2 = bVar.f125622m;
        float fE = td.m.e();
        float f16 = (i15 * bVar.f125615f * fE) + (pointF == null ? 0.0f : (bVar.f125615f * fE) + pointF.y);
        if (this.R.z() && pointF2 != null && pointF != null && f16 >= pointF.y + pointF2.y + bVar.f125612c) {
            return false;
        }
        float f17 = pointF == null ? 0.0f : pointF.x;
        float f18 = pointF2 != null ? pointF2.x : 0.0f;
        int i16 = c.f156987a[bVar.f125613d.ordinal()];
        if (i16 == 1) {
            canvas.translate(f17, f16);
        } else if (i16 == 2) {
            canvas.translate((f17 + f18) - f15, f16);
        } else if (i16 == 3) {
            canvas.translate((f17 + (f18 / 2.0f)) - (f15 / 2.0f), f16);
        }
        return true;
    }

    private String i0(String str) {
        Bidi bidi = new Bidi(str, -2);
        int runCount = bidi.getRunCount();
        byte[] bArr = new byte[runCount];
        Integer[] numArr = new Integer[runCount];
        for (int i15 = 0; i15 < runCount; i15++) {
            bArr[i15] = (byte) bidi.getRunLevel(i15);
            numArr[i15] = Integer.valueOf(i15);
        }
        Bidi.reorderVisually(bArr, 0, numArr, 0, runCount);
        this.G.setLength(0);
        for (int i16 = 0; i16 < runCount; i16++) {
            int iIntValue = numArr[i16].intValue();
            int runStart = bidi.getRunStart(iIntValue);
            int runLimit = bidi.getRunLimit(iIntValue);
            int runLevel = bidi.getRunLevel(iIntValue);
            String strSubstring = str.substring(runStart, runLimit);
            if ((runLevel & 1) == 0) {
                this.G.append(strSubstring);
            } else {
                this.H.setLength(0);
                int length = 0;
                while (length < strSubstring.length()) {
                    String strP = P(strSubstring, length);
                    this.H.insert(0, strP);
                    length += strP.length();
                }
                this.G.append((CharSequence) this.H);
            }
        }
        return this.G.toString();
    }

    private List<d> j0(String str, float f15, md.c cVar, float f16, float f17, boolean z15) {
        float fMeasureText;
        int i15 = 0;
        int i16 = 0;
        boolean z16 = false;
        int i17 = 0;
        float f18 = 0.0f;
        float f19 = 0.0f;
        float f25 = 0.0f;
        for (int i18 = 0; i18 < str.length(); i18++) {
            char cCharAt = str.charAt(i18);
            if (z15) {
                md.d dVarI = this.S.c().i(md.d.c(cCharAt, cVar.a(), cVar.c()));
                if (dVarI != null) {
                    fMeasureText = ((float) dVarI.b()) * f16 * td.m.e();
                }
            } else {
                fMeasureText = this.K.measureText(str.substring(i18, i18 + 1));
            }
            float f26 = fMeasureText + f17;
            if (cCharAt == ' ') {
                z16 = true;
                f25 = f26;
            } else if (z16) {
                z16 = false;
                i17 = i18;
                f19 = f26;
            } else {
                f19 += f26;
            }
            f18 += f26;
            if (f15 > 0.0f && f18 >= f15 && cCharAt != ' ') {
                i15++;
                d dVarA0 = a0(i15);
                if (i17 == i16) {
                    String strSubstring = str.substring(i16, i18);
                    String strTrim = strSubstring.trim();
                    dVarA0.c(strTrim, (f18 - f26) - ((strTrim.length() - strSubstring.length()) * f25));
                    i16 = i18;
                    i17 = i16;
                    f18 = f26;
                    f19 = f18;
                } else {
                    String strSubstring2 = str.substring(i16, i17 - 1);
                    String strTrim2 = strSubstring2.trim();
                    dVarA0.c(strTrim2, ((f18 - f19) - ((strSubstring2.length() - strTrim2.length()) * f25)) - f25);
                    f18 = f19;
                    i16 = i17;
                }
            }
        }
        if (f18 > 0.0f) {
            i15++;
            a0(i15).c(str.substring(i16), f18);
        }
        return this.P.subList(0, i15);
    }

    @Override // pd.b, hd.e
    public void f(RectF rectF, Matrix matrix, boolean z15) {
        super.f(rectF, matrix, z15);
        rectF.set(0.0f, 0.0f, this.S.b().width(), this.S.b().height());
    }

    @Override // pd.b, md.f
    public <T> void g(T t15, ud.c<T> cVar) {
        super.g(t15, cVar);
        if (t15 == g0.f61244a) {
            id.a<Integer, Integer> aVar = this.V;
            if (aVar != null) {
                H(aVar);
            }
            if (cVar == null) {
                this.V = null;
                return;
            }
            t tVar = new t(cVar);
            this.V = tVar;
            tVar.a(this);
            j(this.V);
            return;
        }
        if (t15 == g0.f61245b) {
            id.a<Integer, Integer> aVar2 = this.X;
            if (aVar2 != null) {
                H(aVar2);
            }
            if (cVar == null) {
                this.X = null;
                return;
            }
            t tVar2 = new t(cVar);
            this.X = tVar2;
            tVar2.a(this);
            j(this.X);
            return;
        }
        if (t15 == g0.f61265v) {
            id.a<Float, Float> aVar3 = this.Z;
            if (aVar3 != null) {
                H(aVar3);
            }
            if (cVar == null) {
                this.Z = null;
                return;
            }
            t tVar3 = new t(cVar);
            this.Z = tVar3;
            tVar3.a(this);
            j(this.Z);
            return;
        }
        if (t15 == g0.f61266w) {
            id.a<Float, Float> aVar4 = this.f156978b0;
            if (aVar4 != null) {
                H(aVar4);
            }
            if (cVar == null) {
                this.f156978b0 = null;
                return;
            }
            t tVar4 = new t(cVar);
            this.f156978b0 = tVar4;
            tVar4.a(this);
            j(this.f156978b0);
            return;
        }
        if (t15 == g0.I) {
            id.a<Float, Float> aVar5 = this.f156980d0;
            if (aVar5 != null) {
                H(aVar5);
            }
            if (cVar == null) {
                this.f156980d0 = null;
                return;
            }
            t tVar5 = new t(cVar);
            this.f156980d0 = tVar5;
            tVar5.a(this);
            j(this.f156980d0);
            return;
        }
        if (t15 != g0.P) {
            if (t15 == g0.R) {
                this.Q.s(cVar);
                return;
            }
            return;
        }
        id.a<Typeface, Typeface> aVar6 = this.f156981e0;
        if (aVar6 != null) {
            H(aVar6);
        }
        if (cVar == null) {
            this.f156981e0 = null;
            return;
        }
        t tVar6 = new t(cVar);
        this.f156981e0 = tVar6;
        tVar6.a(this);
        j(this.f156981e0);
    }

    @Override // pd.b
    void u(Canvas canvas, Matrix matrix, int i15, td.b bVar) {
        Canvas canvas2;
        md.b bVarH = this.Q.h();
        md.c cVar = this.S.g().get(bVarH.f125611b);
        if (cVar == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        Q(bVarH, i15, 0);
        if (this.R.p0()) {
            canvas2 = canvas;
            Z(bVarH, matrix, cVar, canvas2, i15);
        } else {
            canvas2 = canvas;
            Y(bVarH, cVar, canvas2, i15);
        }
        canvas2.restore();
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f156988a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f156989b;

        private d() {
            this.f156988a = "";
            this.f156989b = 0.0f;
        }

        void c(String str, float f15) {
            this.f156988a = str;
            this.f156989b = f15;
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }
}
