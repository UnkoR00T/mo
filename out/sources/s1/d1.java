package s1;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.view.textclassifier.TextClassification;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import q1.TextContextMenuRemoteActionItem;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0012\u001a\u00020\u0006*\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ls1/d1;", "", "<init>", "()V", "Landroid/graphics/drawable/Icon;", "icon", "Loq/i0;", "j", "(Landroid/graphics/drawable/Icon;Lm2/r;I)V", "Landroid/graphics/drawable/Drawable;", "drawable", "i", "(Landroid/graphics/drawable/Drawable;Lm2/r;I)V", "Ly0/r;", "Landroid/content/Context;", "context", "Lq1/h;", "component", "q", "(Ly0/r;Landroid/content/Context;Lq1/h;)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d1 f177286a = new d1();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements er.q<Color, p076m2.r, Integer, oq.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Drawable f177287a;

        a(Drawable drawable) {
            this.f177287a = drawable;
        }

        public final void c(long j15, p076m2.r rVar, int i15) {
            if (!rVar.r((i15 & 17) != 16, i15 & 1)) {
                rVar.O();
                return;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(-1123224187, i15, -1, "androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.textClassificationItem.<anonymous>.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:247)");
            }
            d1.f177286a.i(this.f177287a, rVar, 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ oq.i0 w(Color color, p076m2.r rVar, Integer num) {
            c(color.m20unboximpl(), rVar, num.intValue());
            return oq.i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements er.q<Color, p076m2.r, Integer, oq.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RemoteAction f177288a;

        b(RemoteAction remoteAction) {
            this.f177288a = remoteAction;
        }

        public final void c(long j15, p076m2.r rVar, int i15) {
            if (!rVar.r((i15 & 17) != 16, i15 & 1)) {
                rVar.O();
                return;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(-1261173016, i15, -1, "androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.textClassificationItem.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:257)");
            }
            d1.f177286a.j(this.f177288a.getIcon(), rVar, 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ oq.i0 w(Color color, p076m2.r rVar, Integer num) {
            c(color.m20unboximpl(), rVar, num.intValue());
            return oq.i0.f148189a;
        }
    }

    private d1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(final Drawable drawable, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(257732500);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(drawable) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(257732500, i16, -1, "androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.IconBox (DefaultTextContextMenuDropdownProvider.android.kt:274)");
            }
            f3.m mVarT = androidx.compose.foundation.layout.d.t(f3.m.INSTANCE, y0.s.f222582a.g());
            boolean zG = rVarH.G(drawable);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: s1.b1
                    @Override // er.l
                    public final Object b(Object obj) {
                        return d1.m(drawable, (p3.f) obj);
                    }
                };
                rVarH.v(objE);
            }
            d1.r.b(k3.k.b(mVarT, (er.l) objE), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: s1.c1
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d1.n(this.f177277a, drawable, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(final Icon icon, p076m2.r rVar, final int i15) {
        int i16;
        d5 d5VarM;
        er.p<? super p076m2.r, ? super Integer, oq.i0> pVar;
        p076m2.r rVarH = rVar.h(2116504409);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(icon) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(this) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2116504409, i16, -1, "androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.IconBox (DefaultTextContextMenuDropdownProvider.android.kt:267)");
            }
            Context context = (Context) rVarH.N(AndroidCompositionLocals_androidKt.c());
            boolean zW = rVarH.W(icon) | rVarH.W(context);
            Object objE = rVarH.E();
            if (zW || objE == p076m2.r.INSTANCE.a()) {
                objE = icon.loadDrawable(context);
                rVarH.v(objE);
            }
            Drawable drawable = (Drawable) objE;
            if (drawable == null) {
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                d5VarM = rVarH.m();
                if (d5VarM == null) {
                    return;
                } else {
                    pVar = new er.p() { // from class: s1.z0
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return d1.k(this.f177395a, icon, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    };
                }
            } else {
                i(drawable, rVarH, i16 & 112);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
            }
            d5VarM.a(pVar);
        }
        rVarH.O();
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            pVar = new er.p() { // from class: s1.a1
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d1.l(this.f177268a, icon, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            };
            d5VarM.a(pVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(d1 d1Var, Icon icon, int i15, p076m2.r rVar, int i16) {
        d1Var.j(icon, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(d1 d1Var, Icon icon, int i15, p076m2.r rVar, int i16) {
        d1Var.j(icon, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(Drawable drawable, p3.f fVar) {
        n3.h1 h1VarF = fVar.getDrawContext().f();
        drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (fVar.a() >> 32)), (int) Float.intBitsToFloat((int) (fVar.a() & BodyPartID.bodyIdMax)));
        drawable.draw(n3.f0.d(h1VarF));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(d1 d1Var, Drawable drawable, int i15, p076m2.r rVar, int i16) {
        d1Var.i(drawable, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String r(TextClassification textClassification, p076m2.r rVar, int i15) {
        rVar.X(950061013);
        if (p076m2.t.k()) {
            p076m2.t.o(950061013, i15, -1, "androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.textClassificationItem.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:246)");
        }
        String strValueOf = String.valueOf(textClassification.getLabel());
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        rVar.R();
        return strValueOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(Context context, TextClassification textClassification) throws PendingIntent.CanceledException {
        u0.f177379a.a(context, textClassification);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String t(RemoteAction remoteAction, p076m2.r rVar, int i15) {
        rVar.X(-1376593684);
        if (p076m2.t.k()) {
            p076m2.t.o(-1376593684, i15, -1, "androidx.compose.foundation.text.contextmenu.internal.TextContextMenuHelperApi28.textClassificationItem.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:254)");
        }
        String string = remoteAction.getTitle().toString();
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        rVar.R();
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(RemoteAction remoteAction) throws PendingIntent.CanceledException {
        u0.f177379a.b(remoteAction.getActionIntent());
        return oq.i0.f148189a;
    }

    public final void q(y0.r rVar, final Context context, TextContextMenuRemoteActionItem textContextMenuRemoteActionItem) {
        if (context == null) {
            return;
        }
        int index = textContextMenuRemoteActionItem.getIndex();
        final TextClassification textClassification = textContextMenuRemoteActionItem.getTextClassification();
        if (index < 0) {
            er.p pVar = new er.p() { // from class: s1.v0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d1.r(textClassification, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            };
            Drawable icon = textClassification.getIcon();
            y0.r.g(rVar, pVar, null, false, icon != null ? y2.m.b(-1123224187, true, new a(icon)) : null, new er.a() { // from class: s1.w0
                @Override // er.a
                public final Object a() {
                    return d1.s(context, textClassification);
                }
            }, 6, null);
        } else {
            final RemoteAction remoteAction = textClassification.getActions().get(index);
            y0.r.g(rVar, new er.p() { // from class: s1.x0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d1.t(remoteAction, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, null, false, ((index == 0) || remoteAction.shouldShowIcon()) ? y2.m.b(-1261173016, true, new b(remoteAction)) : null, new er.a() { // from class: s1.y0
                @Override // er.a
                public final Object a() {
                    return d1.u(remoteAction);
                }
            }, 6, null);
        }
    }
}
