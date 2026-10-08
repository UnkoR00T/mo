package cn;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.aq;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.br;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.cc;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.dk;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.eq;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.fc;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.fm;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.gk;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.im;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.m0;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.mp;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.om;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.ql;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.sq;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.tl;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.up;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.wp;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.wq;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.xq;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.yp;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zq;
import com.google.android.libraries.vision.visionkit.pipeline.AndroidAssetUtil;
import com.google.android.libraries.vision.visionkit.pipeline.alt.PipelineException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import jg.s;
import qi.b1;
import qi.c2;
import qi.d1;
import qi.h4;
import qi.i4;
import qi.p2;
import qi.s2;
import qi.w1;
import qi.y1;
import qi.z1;

/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f28315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f28316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    i f28317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f28318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f28319e = true;

    private j(Context context, a aVar) {
        this.f28315a = context;
        this.f28316b = aVar;
    }

    public static j a(Context context, a aVar) {
        return new j(context, aVar);
    }

    public final o b(rg.b bVar, mp mpVar, boolean z15) {
        tl tlVarE;
        fm fmVar;
        fm fmVar2;
        fm fmVar3;
        p pVarC = c();
        if (!pVarC.d()) {
            return o.e(pVarC);
        }
        try {
            int i15 = 1;
            if (mpVar.m() == -1) {
                Bitmap bitmapCopy = (Bitmap) s.l((Bitmap) rg.d.n3(bVar));
                Bitmap.Config config = bitmapCopy.getConfig();
                Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
                if (config != config2) {
                    String.valueOf(bitmapCopy.getConfig());
                    bitmapCopy = bitmapCopy.copy(config2, bitmapCopy.isMutable());
                }
                tlVarE = ((i) s.l(this.f28317c)).i(SystemClock.elapsedRealtime() * 1000, bitmapCopy, k.b(mpVar.p()));
            } else if (mpVar.m() == 35) {
                Image.Plane[] planes = ((Image) s.l(rg.d.n3(bVar))).getPlanes();
                tlVarE = ((i) s.l(this.f28317c)).j(SystemClock.elapsedRealtime() * 1000, ((Image.Plane) s.l(planes[0])).getBuffer(), ((Image.Plane) s.l(planes[1])).getBuffer(), ((Image.Plane) s.l(planes[2])).getBuffer(), mpVar.r(), mpVar.h(), ((Image.Plane) s.l(planes[0])).getRowStride(), ((Image.Plane) s.l(planes[1])).getRowStride(), ((Image.Plane) s.l(planes[1])).getPixelStride(), k.b(mpVar.p()));
            } else if (mpVar.m() == 17) {
                tlVarE = ((i) s.l(this.f28317c)).e(k.a(wm.c.a((ByteBuffer) s.l((ByteBuffer) rg.d.n3(bVar))), mpVar));
            } else {
                if (mpVar.m() != 842094169) {
                    throw new lm.a("Unsupported image format: " + mpVar.m(), 3);
                }
                tlVarE = ((i) s.l(this.f28317c)).e(k.a(wm.c.j((ByteBuffer) s.l(rg.d.n3(bVar)), true), mpVar));
            }
            if (!tlVarE.c()) {
                return o.e(p.c(3, new RemoteException("VisionKit pipeline returns empty result.")));
            }
            c2 c2Var = (c2) tlVarE.a();
            Matrix matrixE = wm.d.b().e(mpVar.r(), mpVar.h(), mpVar.p());
            boolean z16 = this.f28319e;
            c cVar = new c(0, tl.d());
            List<m0> listH = c2Var.I().H();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            for (m0 m0Var : listH) {
                if (m0Var.G() == 6) {
                    sq sqVarB = g.b(m0Var.J());
                    List listC = g.c(sqVarB);
                    eq eqVar = new eq(m0Var.F(), g.a(listC, matrixE), listC, m0Var.H(), sqVarB.E());
                    Integer numValueOf = Integer.valueOf(m0Var.I());
                    if (map2.containsKey(numValueOf)) {
                        fmVar3 = (fm) map2.get(numValueOf);
                    } else {
                        fm fmVar4 = new fm();
                        map2.put(numValueOf, fmVar4);
                        fmVar3 = fmVar4;
                    }
                    ((fm) s.l(fmVar3)).a(eqVar);
                }
            }
            int i16 = 0;
            while (i16 < listH.size()) {
                m0 m0Var2 = (m0) listH.get(i16);
                if (m0Var2.G() == i15) {
                    sq sqVarB2 = g.b(m0Var2.J());
                    List listC2 = g.c(sqVarB2);
                    Integer numValueOf2 = Integer.valueOf(i16);
                    wp wpVar = new wp(m0Var2.F(), g.a(listC2, matrixE), listC2, h.a(m0Var2.K().G()), m0Var2.H(), sqVarB2.E(), (List) s.l(map2.containsKey(numValueOf2) ? ((fm) s.l((fm) map2.get(numValueOf2))).b() : im.k()));
                    Integer numValueOf3 = Integer.valueOf(m0Var2.I());
                    if (map.containsKey(numValueOf3)) {
                        fmVar2 = (fm) map.get(numValueOf3);
                    } else {
                        fm fmVar5 = new fm();
                        map.put(numValueOf3, fmVar5);
                        fmVar2 = fmVar5;
                    }
                    ((fm) s.l(fmVar2)).a(wpVar);
                }
                i16++;
                i15 = 1;
            }
            for (int i17 = 0; i17 < listH.size(); i17++) {
                m0 m0Var3 = (m0) listH.get(i17);
                if (m0Var3.G() == 3) {
                    sq sqVarB3 = g.b(m0Var3.J());
                    List listC3 = g.c(sqVarB3);
                    Integer numValueOf4 = Integer.valueOf(i17);
                    yp ypVar = new yp(m0Var3.F(), g.a(listC3, matrixE), listC3, h.a(m0Var3.K().G()), (List) s.l(map.containsKey(numValueOf4) ? ((fm) s.l((fm) map.get(numValueOf4))).b() : im.k()), m0Var3.H(), sqVarB3.E());
                    Integer numValueOf5 = Integer.valueOf(m0Var3.I());
                    if (map3.containsKey(numValueOf5)) {
                        fmVar = (fm) map3.get(numValueOf5);
                    } else {
                        fm fmVar6 = new fm();
                        map3.put(Integer.valueOf(m0Var3.I()), fmVar6);
                        fmVar = fmVar6;
                    }
                    ((fm) s.l(fmVar)).a(ypVar);
                }
            }
            fm fmVar7 = new fm();
            for (int i18 = 0; i18 < listH.size(); i18++) {
                m0 m0Var4 = (m0) listH.get(i18);
                if (m0Var4.G() == 4) {
                    List listC4 = g.c(g.b(m0Var4.J()));
                    im imVarK = im.k();
                    Integer numValueOf6 = Integer.valueOf(i18);
                    if (map3.containsKey(numValueOf6)) {
                        imVarK = ((fm) s.l((fm) map3.get(numValueOf6))).b();
                        map3.remove(numValueOf6);
                    }
                    fmVar7.a(new up(n.f28320a.b(om.a(imVarK, new ql() { // from class: cn.l
                        @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.ql
                        public final Object a(Object obj) {
                            return ((yp) obj).p();
                        }
                    })), g.a(listC4, matrixE), listC4, h.a(m0Var4.K().G()), (List) s.l(imVarK)));
                }
            }
            Iterator it = map3.values().iterator();
            while (it.hasNext()) {
                im imVarB = ((fm) it.next()).b();
                int size = imVarB.size();
                for (int i19 = 0; i19 < size; i19++) {
                    yp ypVar2 = (yp) imVarB.get(i19);
                    fmVar7.a(new up(ypVar2.p(), ypVar2.h(), ypVar2.r(), ypVar2.m(), im.n(ypVar2)));
                }
            }
            im imVarB2 = fmVar7.b();
            b bVar2 = new b(cVar, new aq(n.f28320a.b(om.a(imVarB2, new ql() { // from class: cn.m
                @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.ql
                public final Object a(Object obj) {
                    return ((up) obj).h();
                }
            })), imVarB2), im.k(), z16);
            this.f28319e = false;
            return bVar2;
        } catch (lm.a e15) {
            return o.e(p.c(2, new RemoteException("Failed to process input image.".concat(String.valueOf(e15.getMessage())))));
        }
    }

    public final p c() {
        if (this.f28318d) {
            return new c(0, tl.d());
        }
        if (this.f28317c == null) {
            AndroidAssetUtil.a(this.f28315a);
            a aVar = this.f28316b;
            String strB = aVar.b();
            String strD = aVar.d();
            String strC = aVar.c();
            boolean zE = aVar.e();
            b1 b1VarF = d1.F();
            int i15 = zE ? 4 : 0;
            p2 p2VarF = s2.F();
            cc ccVarE = fc.E();
            ccVarE.x(strD);
            ccVarE.t(strB);
            ccVarE.y(true);
            ccVarE.v(true);
            if (!strC.isEmpty()) {
                wq wqVarE = xq.E();
                zq zqVarE = br.E();
                zqVarE.t(strC);
                wqVarE.t(zqVarE);
                ccVarE.w(wqVarE);
            }
            p2VarF.w(ccVarE);
            int iA = y1.a(i15);
            w1 w1VarE = z1.E();
            w1VarE.t(iA);
            p2VarF.x(w1VarE);
            dk dkVarE = gk.E();
            dkVarE.t("PassThroughCoarseClassifier");
            p2VarF.v(dkVarE);
            b1VarF.t(p2VarF);
            h4 h4VarE = i4.E();
            h4VarE.t(2);
            b1VarF.v(h4VarE);
            this.f28317c = new i((d1) b1VarF.L(), this.f28316b.b(), "mlkit_google_ocr_pipeline");
        }
        try {
            ((i) s.l(this.f28317c)).g();
            this.f28318d = true;
            return new c(0, tl.d());
        } catch (PipelineException e15) {
            return p.c(1, new RemoteException("Failed to initialize detector. ".concat((String) e15.getRootCauseMessage().b(""))));
        }
    }

    public final void d() {
        i iVar = this.f28317c;
        if (iVar != null) {
            if (this.f28318d) {
                iVar.h();
            }
            this.f28317c.f();
            this.f28317c = null;
        }
        this.f28318d = false;
        this.f28319e = true;
    }
}
