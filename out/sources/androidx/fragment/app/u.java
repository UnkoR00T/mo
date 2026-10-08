package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
class u implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final FragmentManager f12668a;

    class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a0 f12669a;

        a(a0 a0Var) {
            this.f12669a = a0Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            o oVarK = this.f12669a.k();
            this.f12669a.m();
            k0.u((ViewGroup) oVarK.R.getParent(), u.this.f12668a).q();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    u(FragmentManager fragmentManager) {
        this.f12668a = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        a0 a0VarW;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f12668a);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d7.c.f40111a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(d7.c.f40112b);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(d7.c.f40113c, -1);
        String string = typedArrayObtainStyledAttributes.getString(d7.c.f40114d);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !s.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id5 = view != null ? view.getId() : 0;
        if (id5 == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        o oVarI0 = resourceId != -1 ? this.f12668a.i0(resourceId) : null;
        if (oVarI0 == null && string != null) {
            oVarI0 = this.f12668a.j0(string);
        }
        if (oVarI0 == null && id5 != -1) {
            oVarI0 = this.f12668a.i0(id5);
        }
        if (oVarI0 == null) {
            oVarI0 = this.f12668a.w0().a(context.getClassLoader(), attributeValue);
            oVarI0.f12606r = true;
            oVarI0.C = resourceId != 0 ? resourceId : id5;
            oVarI0.D = id5;
            oVarI0.E = string;
            oVarI0.f12608s = true;
            FragmentManager fragmentManager = this.f12668a;
            oVarI0.f12619y = fragmentManager;
            oVarI0.f12621z = fragmentManager.y0();
            oVarI0.J0(this.f12668a.y0().getContext(), attributeSet, oVarI0.f12590b);
            a0VarW = this.f12668a.j(oVarI0);
            if (FragmentManager.L0(2)) {
                oVarI0.toString();
                Integer.toHexString(resourceId);
            }
        } else {
            if (oVarI0.f12608s) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id5) + " with another fragment for " + attributeValue);
            }
            oVarI0.f12608s = true;
            FragmentManager fragmentManager2 = this.f12668a;
            oVarI0.f12619y = fragmentManager2;
            oVarI0.f12621z = fragmentManager2.y0();
            oVarI0.J0(this.f12668a.y0().getContext(), attributeSet, oVarI0.f12590b);
            a0VarW = this.f12668a.w(oVarI0);
            if (FragmentManager.L0(2)) {
                oVarI0.toString();
                Integer.toHexString(resourceId);
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        f7.c.g(oVarI0, viewGroup);
        oVarI0.P = viewGroup;
        a0VarW.m();
        a0VarW.j();
        View view2 = oVarI0.R;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (oVarI0.R.getTag() == null) {
            oVarI0.R.setTag(string);
        }
        oVarI0.R.addOnAttachStateChangeListener(new a(a0VarW));
        return oVarI0.R;
    }
}
