package zm;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import fh.al;
import fh.el;
import fh.tk;
import fh.uj;
import fh.w0;
import fh.wk;
import fh.yk;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f235639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f235640b;

    public static class c extends d {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f235647e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f235648f;

        c(el elVar, Matrix matrix) {
            super(elVar.c(), elVar.p(), elVar.r(), "", matrix);
            this.f235647e = elVar.m();
            this.f235648f = elVar.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f235649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rect f235650b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Point[] f235651c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f235652d;

        d(String str, Rect rect, List list, String str2, Matrix matrix) {
            this.f235649a = str;
            Rect rect2 = new Rect(rect);
            if (matrix != null) {
                wm.b.e(rect2, matrix);
            }
            this.f235650b = rect2;
            Point[] pointArr = new Point[list.size()];
            for (int i15 = 0; i15 < list.size(); i15++) {
                pointArr[i15] = new Point((Point) list.get(i15));
            }
            if (matrix != null) {
                wm.b.b(pointArr, matrix);
            }
            this.f235651c = pointArr;
            this.f235652d = str2;
        }

        public String a() {
            return this.f235652d;
        }

        protected final String b() {
            String str = this.f235649a;
            return str == null ? "" : str;
        }
    }

    public a(al alVar, final Matrix matrix) {
        ArrayList arrayList = new ArrayList();
        this.f235639a = arrayList;
        this.f235640b = alVar.h();
        arrayList.addAll(w0.a(alVar.m(), new uj() { // from class: zm.e
            @Override // fh.uj
            public final Object b(Object obj) {
                return new a.e((tk) obj, matrix);
            }
        }));
    }

    public String a() {
        return this.f235640b;
    }

    public a(String str, List list) {
        ArrayList arrayList = new ArrayList();
        this.f235639a = arrayList;
        arrayList.addAll(list);
        this.f235640b = str;
    }

    public static class b extends d {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List f235644e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f235645f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final float f235646g;

        b(yk ykVar, final Matrix matrix, float f15, float f16) {
            super(ykVar.d(), ykVar.p(), ykVar.r(), ykVar.c(), matrix);
            this.f235644e = w0.a(ykVar.u(), new uj() { // from class: zm.g
                @Override // fh.uj
                public final Object b(Object obj) {
                    return new a.C6362a((wk) obj, matrix);
                }
            });
            this.f235645f = f15;
            this.f235646g = f16;
        }

        public String c() {
            return b();
        }

        public b(String str, Rect rect, List list, String str2, Matrix matrix, List list2, float f15, float f16) {
            super(str, rect, list, str2, matrix);
            this.f235644e = list2;
            this.f235645f = f15;
            this.f235646g = f16;
        }
    }

    public static class e extends d {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List f235653e;

        e(tk tkVar, final Matrix matrix) {
            super(tkVar.a(), tkVar.h(), tkVar.p(), tkVar.m(), matrix);
            this.f235653e = w0.a(tkVar.r(), new uj() { // from class: zm.h
                @Override // fh.uj
                public final Object b(Object obj) {
                    yk ykVar = (yk) obj;
                    return new a.b(ykVar, matrix, ykVar.m(), ykVar.h());
                }
            });
        }

        public String c() {
            return b();
        }

        public e(String str, Rect rect, List list, String str2, Matrix matrix, List list2) {
            super(str, rect, list, str2, matrix);
            this.f235653e = list2;
        }
    }

    /* JADX INFO: renamed from: zm.a$a, reason: collision with other inner class name */
    public static class C6362a extends d {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List f235641e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f235642f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final float f235643g;

        C6362a(wk wkVar, final Matrix matrix) {
            super(wkVar.d(), wkVar.p(), wkVar.r(), wkVar.c(), matrix);
            this.f235642f = wkVar.m();
            this.f235643g = wkVar.h();
            List listU = wkVar.u();
            this.f235641e = w0.a(listU == null ? new ArrayList() : listU, new uj() { // from class: zm.f
                @Override // fh.uj
                public final Object b(Object obj) {
                    return new a.c((el) obj, matrix);
                }
            });
        }

        public C6362a(String str, Rect rect, List list, String str2, Matrix matrix, float f15, float f16, List list2) {
            super(str, rect, list, str2, matrix);
            this.f235642f = f15;
            this.f235643g = f16;
            this.f235641e = list2;
        }
    }
}
