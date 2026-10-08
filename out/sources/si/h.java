package si;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import io.sentry.android.core.c2;
import java.util.ArrayList;
import java.util.List;
import r0.l1;

/* JADX INFO: loaded from: classes4.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l1<String, i> f181928a = new l1<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l1<String, PropertyValuesHolder[]> f181929b = new l1<>();

    private static void a(h hVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            hVar.h(objectAnimator.getPropertyName(), objectAnimator.getValues());
            hVar.i(objectAnimator.getPropertyName(), i.b(objectAnimator));
        } else {
            throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
        }
    }

    public static h b(Context context, TypedArray typedArray, int i15) {
        int resourceId;
        if (!typedArray.hasValue(i15) || (resourceId = typedArray.getResourceId(i15, 0)) == 0) {
            return null;
        }
        return c(context, resourceId);
    }

    public static h c(Context context, int i15) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i15);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return d(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return d(arrayList);
        } catch (Exception e15) {
            c2.h("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i15), e15);
            return null;
        }
    }

    private static h d(List<Animator> list) {
        h hVar = new h();
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            a(hVar, list.get(i15));
        }
        return hVar;
    }

    public i e(String str) {
        if (g(str)) {
            return this.f181928a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            return this.f181928a.equals(((h) obj).f181928a);
        }
        return false;
    }

    public long f() {
        int size = this.f181928a.getSize();
        long jMax = 0;
        for (int i15 = 0; i15 < size; i15++) {
            i iVarK = this.f181928a.k(i15);
            jMax = Math.max(jMax, iVarK.c() + iVarK.d());
        }
        return jMax;
    }

    public boolean g(String str) {
        return this.f181928a.get(str) != null;
    }

    public void h(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f181929b.put(str, propertyValuesHolderArr);
    }

    public int hashCode() {
        return this.f181928a.hashCode();
    }

    public void i(String str, i iVar) {
        this.f181928a.put(str, iVar);
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f181928a + "}\n";
    }
}
