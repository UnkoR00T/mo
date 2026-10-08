package p049fm;

import androidx.compose.ui.graphics.Color;
import er.l;
import er.p;
import java.util.Iterator;
import java.util.List;
import lh.c;
import n3.o1;
import nh.m;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.g4;
import p076m2.r;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a·\u0001\u0010\u0018\u001a\u00020\u00162\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00000\u00002\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0007¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"", "Lcom/google/android/gms/maps/model/LatLng;", "points", "", "clickable", "Landroidx/compose/ui/graphics/Color;", "fillColor", "geodesic", "holes", "strokeColor", "", "strokeJointType", "Lnh/j;", "strokePattern", "", "strokeWidth", "", "tag", "visible", "zIndex", "Lkotlin/Function1;", "Lnh/l;", "Loq/i0;", "onClick", "p", "(Ljava/util/List;ZJZLjava/util/List;JILjava/util/List;FLjava/lang/Object;ZFLer/l;Lm2/r;III)V", "maps-compose_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class m5 {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    static final class a implements p<n5, Color, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f65225a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(n5 n5Var, Color color) {
            c(n5Var, color.m20unboximpl());
            return i0.f148189a;
        }

        public final void c(n5 n5Var, long j15) {
            n5Var.getPolygon().c(o1.j(j15));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    static final class b implements p<n5, Color, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f65226a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(n5 n5Var, Color color) {
            c(n5Var, color.m20unboximpl());
            return i0.f148189a;
        }

        public final void c(n5 n5Var, long j15) {
            n5Var.getPolygon().g(o1.j(j15));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(n5 n5Var, List list) {
        n5Var.getPolygon().i(list);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B(n5 n5Var, float f15) {
        n5Var.getPolygon().j(f15);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C(n5 n5Var, Object obj) {
        n5Var.getPolygon().k(obj);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D(n5 n5Var, boolean z15) {
        n5Var.getPolygon().l(z15);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(List list, boolean z15, long j15, boolean z16, List list2, long j16, int i15, List list3, float f15, Object obj, boolean z17, float f16, l lVar, int i16, int i17, int i18, r rVar, int i19) {
        p(list, z15, j15, z16, list2, j16, i15, list3, f15, obj, z17, f16, lVar, rVar, g4.a(i16 | 1), g4.a(i17), i18);
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0127  */
    /* JADX WARN: Code duplicated, block: B:102:0x012a  */
    /* JADX WARN: Code duplicated, block: B:106:0x0132  */
    /* JADX WARN: Code duplicated, block: B:107:0x013b  */
    /* JADX WARN: Code duplicated, block: B:109:0x013f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0149  */
    /* JADX WARN: Code duplicated, block: B:112:0x014c  */
    /* JADX WARN: Code duplicated, block: B:114:0x0151  */
    /* JADX WARN: Code duplicated, block: B:117:0x015b  */
    /* JADX WARN: Code duplicated, block: B:119:0x0162  */
    /* JADX WARN: Code duplicated, block: B:121:0x0166  */
    /* JADX WARN: Code duplicated, block: B:123:0x0170  */
    /* JADX WARN: Code duplicated, block: B:124:0x0173  */
    /* JADX WARN: Code duplicated, block: B:126:0x0178  */
    /* JADX WARN: Code duplicated, block: B:129:0x0181  */
    /* JADX WARN: Code duplicated, block: B:130:0x0184  */
    /* JADX WARN: Code duplicated, block: B:132:0x018a  */
    /* JADX WARN: Code duplicated, block: B:134:0x0192  */
    /* JADX WARN: Code duplicated, block: B:135:0x0195  */
    /* JADX WARN: Code duplicated, block: B:138:0x019c  */
    /* JADX WARN: Code duplicated, block: B:141:0x01af  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:149:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:152:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:155:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:157:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:159:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:161:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:163:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:166:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:167:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:169:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:170:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:172:0x0203  */
    /* JADX WARN: Code duplicated, block: B:173:0x0206  */
    /* JADX WARN: Code duplicated, block: B:175:0x020a  */
    /* JADX WARN: Code duplicated, block: B:176:0x020e  */
    /* JADX WARN: Code duplicated, block: B:178:0x0212  */
    /* JADX WARN: Code duplicated, block: B:180:0x0220  */
    /* JADX WARN: Code duplicated, block: B:182:0x0233  */
    /* JADX WARN: Code duplicated, block: B:185:0x0241  */
    /* JADX WARN: Code duplicated, block: B:186:0x024c  */
    /* JADX WARN: Code duplicated, block: B:189:0x0254  */
    /* JADX WARN: Code duplicated, block: B:191:0x025a  */
    /* JADX WARN: Code duplicated, block: B:194:0x0263  */
    /* JADX WARN: Code duplicated, block: B:196:0x0280  */
    /* JADX WARN: Code duplicated, block: B:198:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:199:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:202:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:203:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:206:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:207:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:210:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:211:0x02df  */
    /* JADX WARN: Code duplicated, block: B:214:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:215:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:218:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:219:0x0302  */
    /* JADX WARN: Code duplicated, block: B:222:0x030a  */
    /* JADX WARN: Code duplicated, block: B:223:0x030d  */
    /* JADX WARN: Code duplicated, block: B:226:0x0316  */
    /* JADX WARN: Code duplicated, block: B:227:0x0319  */
    /* JADX WARN: Code duplicated, block: B:231:0x0328  */
    /* JADX WARN: Code duplicated, block: B:234:0x0332  */
    /* JADX WARN: Code duplicated, block: B:238:0x034a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:241:0x037c  */
    /* JADX WARN: Code duplicated, block: B:244:0x0388  */
    /* JADX WARN: Code duplicated, block: B:245:0x038c  */
    /* JADX WARN: Code duplicated, block: B:248:0x041e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    /* JADX WARN: Code duplicated, block: B:251:0x0428  */
    /* JADX WARN: Code duplicated, block: B:254:0x0447  */
    /* JADX WARN: Code duplicated, block: B:256:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00db  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:90:0x0105  */
    /* JADX WARN: Code duplicated, block: B:91:0x0108  */
    /* JADX WARN: Code duplicated, block: B:95:0x0112  */
    /* JADX WARN: Code duplicated, block: B:97:0x0119  */
    /* JADX WARN: Code duplicated, block: B:99:0x011d  */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException
        */
    public static final void p(final java.util.List<com.google.android.gms.maps.model.LatLng> r39, boolean r40, long r41, boolean r43, java.util.List<? extends java.util.List<com.google.android.gms.maps.model.LatLng>> r44, long r45, int r47, java.util.List<? extends nh.j> r48, float r49, java.lang.Object r50, boolean r51, float r52, er.l<? super nh.l, oq.i0> r53, p076m2.r r54, final int r55, final int r56, final int r57) {
        /*
            Method dump skipped, instruction units count: 1129
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p049fm.m5.p(java.util.List, boolean, long, boolean, java.util.List, long, int, java.util.List, float, java.lang.Object, boolean, float, er.l, m2.r, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(nh.l lVar) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(List list, boolean z15, long j15, boolean z16, List list2, long j16, int i15, List list3, float f15, Object obj, boolean z17, float f16, l lVar, int i16, int i17, int i18, r rVar, int i19) {
        p(list, z15, j15, z16, list2, j16, i15, list3, f15, obj, z17, f16, lVar, rVar, g4.a(i16 | 1), g4.a(i17), i18);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n5 s(g1 g1Var, Object obj, l lVar, List list, boolean z15, long j15, boolean z16, List list2, long j16, int i15, List list3, float f15, boolean z17, float f16) {
        c map;
        if (g1Var != null && (map = g1Var.getMap()) != null) {
            m mVar = new m();
            mVar.h(list);
            mVar.p(z15);
            mVar.r(o1.j(j15));
            mVar.u(z16);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                mVar.m((List) it.next());
            }
            mVar.O(o1.j(j16));
            mVar.V(i15);
            mVar.Z(list3);
            mVar.a0(f15);
            mVar.b0(z17);
            mVar.c0(f16);
            nh.l lVarB = map.b(mVar);
            if (lVarB != null) {
                lVarB.k(obj);
                return new n5(lVarB, lVar);
            }
        }
        throw new IllegalStateException("Error adding polygon");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(n5 n5Var, l lVar) {
        n5Var.d(lVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(n5 n5Var, List list) {
        n5Var.getPolygon().f(list);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(n5 n5Var, float f15) {
        n5Var.getPolygon().m(f15);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(n5 n5Var, boolean z15) {
        n5Var.getPolygon().b(z15);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(n5 n5Var, boolean z15) {
        n5Var.getPolygon().d(z15);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y(n5 n5Var, List list) {
        n5Var.getPolygon().e(list);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(n5 n5Var, int i15) {
        n5Var.getPolygon().h(i15);
        return i0.f148189a;
    }
}
