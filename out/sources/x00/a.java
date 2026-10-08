package x00;

import android.content.res.Resources;
import android.content.res.TypedArray;
import fr.v0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import mx.Label;
import mx.b;
import mx.c;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00062\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\"\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0012\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00062\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\r\"\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u0018\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00170\r\"\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001e¨\u0006\u001f"}, d2 = {"Lx00/a;", "Lmx/c;", "Landroid/content/res/Resources;", "resources", "<init>", "(Landroid/content/res/Resources;)V", "", "stringArrayId", "", "Lmx/a;", "d", "(I)Ljava/util/List;", "stringId", "", "", "arg", "e", "(I[Ljava/lang/Object;)Lmx/a;", "f", "(I[Lmx/a;)Lmx/a;", "c", "(I)Lmx/a;", "quantity", "", "a", "(II[Ljava/lang/String;)Lmx/a;", "text", "tagId", "b", "(Ljava/lang/String;I)Lmx/a;", "Landroid/content/res/Resources;", "resources_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Resources resources;

    public a(Resources resources) {
        this.resources = resources;
    }

    @Override // mx.c
    public Label a(int stringId, int quantity, String... arg) {
        return new Label(this.resources.getQuantityString(stringId, quantity, Arrays.copyOf(arg, arg.length)), b.c(this.resources.getResourceEntryName(stringId)));
    }

    @Override // mx.c
    public Label b(String text, int tagId) {
        return new Label(text, b.c(this.resources.getResourceEntryName(tagId)));
    }

    @Override // mx.c
    public Label c(int stringId) {
        return new Label(this.resources.getString(stringId), b.c(this.resources.getResourceEntryName(stringId)));
    }

    @Override // mx.c
    public List<Label> d(int stringArrayId) {
        TypedArray typedArrayObtainTypedArray = this.resources.obtainTypedArray(stringArrayId);
        ArrayList arrayList = new ArrayList();
        int length = typedArrayObtainTypedArray.length();
        for (int i15 = 0; i15 < length; i15++) {
            int resourceId = typedArrayObtainTypedArray.getResourceId(i15, 0);
            if (resourceId > 0) {
                arrayList.add(c(resourceId));
            }
        }
        typedArrayObtainTypedArray.recycle();
        return v.f1(arrayList);
    }

    @Override // mx.c
    public Label e(int stringId, Object... arg) {
        String string = this.resources.getString(stringId);
        v0 v0Var = v0.f66418a;
        Locale locale = this.resources.getConfiguration().getLocales().get(0);
        Object[] objArrCopyOf = Arrays.copyOf(arg, arg.length);
        return new Label(String.format(locale, string, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)), b.c(this.resources.getResourceEntryName(stringId)));
    }

    @Override // mx.c
    public Label f(int stringId, Label... arg) {
        ArrayList arrayList = new ArrayList(arg.length);
        for (Label label : arg) {
            arrayList.add(label.getText());
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        return e(stringId, Arrays.copyOf(strArr, strArr.length));
    }
}
