package h3;

import android.view.View;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\b\u0010\u0012R\"\u0010\u0019\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lh3/a;", "Lh3/i;", "Landroid/view/View;", "view", "Lh3/p;", "autofillTree", "<init>", "(Landroid/view/View;Lh3/p;)V", "a", "Landroid/view/View;", "d", "()Landroid/view/View;", "b", "Lh3/p;", "()Lh3/p;", "Landroid/view/autofill/AutofillManager;", "c", "Landroid/view/autofill/AutofillManager;", "()Landroid/view/autofill/AutofillManager;", "autofillManager", "Landroid/view/autofill/AutofillId;", "Landroid/view/autofill/AutofillId;", "()Landroid/view/autofill/AutofillId;", "setRootAutofillId", "(Landroid/view/autofill/AutofillId;)V", "rootAutofillId", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p autofillTree;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AutofillManager autofillManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private AutofillId rootAutofillId;

    public a(View view, p pVar) {
        this.view = view;
        this.autofillTree = pVar;
        AutofillManager autofillManager = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.autofillManager = autofillManager;
        view.setImportantForAutofill(1);
        j4.a aVarA = j4.d.a(view);
        AutofillId autofillIdA = aVarA != null ? aVarA.a() : null;
        if (autofillIdA != null) {
            this.rootAutofillId = autofillIdA;
        } else {
            d4.a.d("Required value was null.");
            throw new oq.g();
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AutofillManager getAutofillManager() {
        return this.autofillManager;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final p getAutofillTree() {
        return this.autofillTree;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AutofillId getRootAutofillId() {
        return this.rootAutofillId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final View getView() {
        return this.view;
    }
}
