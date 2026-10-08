package l4;

import android.content.res.Resources;
import android.util.TypedValue;
import oq.i0;
import p071kotlin.Metadata;
import r0.j0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\u0003R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u0010"}, d2 = {"Ll4/d;", "", "<init>", "()V", "Landroid/content/res/Resources;", "res", "", "id", "Landroid/util/TypedValue;", "b", "(Landroid/content/res/Resources;I)Landroid/util/TypedValue;", "Loq/i0;", "a", "Lr0/j0;", "Lr0/j0;", "resIdPathMap", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j0<TypedValue> resIdPathMap = new j0<>(0, 1, null);

    public final void a() {
        synchronized (this) {
            this.resIdPathMap.g();
            i0 i0Var = i0.f148189a;
        }
    }

    public final TypedValue b(Resources res, int id5) {
        TypedValue typedValueB;
        synchronized (this) {
            typedValueB = this.resIdPathMap.b(id5);
            if (typedValueB == null) {
                typedValueB = new TypedValue();
                res.getValue(id5, typedValueB, true);
                this.resIdPathMap.n(id5, typedValueB);
            }
        }
        return typedValueB;
    }
}
