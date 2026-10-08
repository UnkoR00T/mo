package u4;

import android.content.Context;
import android.graphics.Typeface;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0082@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lu4/s0;", "Landroid/content/Context;", "context", "Landroid/graphics/Typeface;", "c", "(Lu4/s0;Landroid/content/Context;)Landroid/graphics/Typeface;", "d", "(Lu4/s0;Landroid/content/Context;Ltq/e;)Ljava/lang/Object;", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"u4/c$a", "Lw5/h$e;", "Landroid/graphics/Typeface;", "typeface", "Loq/i0;", "g", "(Landroid/graphics/Typeface;)V", "", "reason", "f", "(I)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends w5.h.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ju.n<Typeface> f195190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ResourceFont f195191b;

        /* JADX WARN: Multi-variable type inference failed */
        a(ju.n<? super Typeface> nVar, ResourceFont resourceFont) {
            this.f195190a = nVar;
            this.f195191b = resourceFont;
        }

        @Override // w5.h.e
        public void f(int reason) {
            this.f195190a.Q(new IllegalStateException("Unable to load font " + this.f195191b + " (reason=" + reason + ')'));
        }

        @Override // w5.h.e
        public void g(Typeface typeface) {
            this.f195190a.i(oq.t.b(typeface));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Typeface c(ResourceFont resourceFont, Context context) {
        return w5.h.g(context, resourceFont.getResId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(ResourceFont resourceFont, Context context, tq.e<? super Typeface> eVar) {
        ju.p pVar = new ju.p(uq.b.c(eVar), 1);
        pVar.D();
        w5.h.i(context, resourceFont.getResId(), new a(pVar, resourceFont), null);
        Object objX = pVar.x();
        if (objX == uq.b.e()) {
            vq.g.c(eVar);
        }
        return objX;
    }
}
