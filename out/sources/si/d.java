package si;

import android.util.Property;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public class d extends Property<ViewGroup, Float> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Property<ViewGroup, Float> f181922a = new d("childrenAlpha");

    private d(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float get(ViewGroup viewGroup) {
        Float f15 = (Float) viewGroup.getTag(ri.f.C);
        return f15 != null ? f15 : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(ViewGroup viewGroup, Float f15) {
        float fFloatValue = f15.floatValue();
        viewGroup.setTag(ri.f.C, f15);
        int childCount = viewGroup.getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            viewGroup.getChildAt(i15).setAlpha(fFloatValue);
        }
    }
}
