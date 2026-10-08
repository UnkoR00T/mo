package i3;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0004H&¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, d2 = {"Li3/j;", "", "", "virtualChildId", "Landroid/view/autofill/AutofillId;", "d", "(J)Landroid/view/autofill/AutofillId;", "parentId", "virtualId", "Lj4/e;", "a", "(Landroid/view/autofill/AutofillId;J)Lj4/e;", "Landroid/view/ViewStructure;", "node", "Loq/i0;", "c", "(Landroid/view/ViewStructure;)V", "flush", "()V", "id", "b", "(Landroid/view/autofill/AutofillId;)V", "", "text", "e", "(Landroid/view/autofill/AutofillId;Ljava/lang/CharSequence;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface j {
    j4.e a(AutofillId parentId, long virtualId);

    void b(AutofillId id5);

    void c(ViewStructure node);

    AutofillId d(long virtualChildId);

    void e(AutofillId id5, CharSequence text);

    void flush();
}
