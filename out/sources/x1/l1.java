package x1;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\"4\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lx1/k1;", "b", "()Lx1/k1;", "Landroid/view/inputmethod/EditorInfo;", "Loq/i0;", "d", "(Landroid/view/inputmethod/EditorInfo;)V", "Lkotlin/Function1;", "Landroid/view/View;", "Lx1/c1;", "a", "Ler/l;", "c", "()Ler/l;", "setInputMethodManagerFactory", "(Ler/l;)V", "getInputMethodManagerFactory$annotations", "()V", "inputMethodManagerFactory", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static er.l<? super View, ? extends c1> f216371a = a.f216372j;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.l<View, e1> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f216372j = new a();

        a() {
            super(1, e1.class, "<init>", "<init>(Landroid/view/View;)V", 0);
        }

        @Override // er.l
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final e1 b(View view) {
            return new e1(view);
        }
    }

    public static final k1 b() {
        return new c();
    }

    public static final er.l<View, c1> c() {
        return f216371a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(EditorInfo editorInfo) {
        if (androidx.emoji2.text.e.k()) {
            androidx.emoji2.text.e.c().x(editorInfo);
        }
    }
}
