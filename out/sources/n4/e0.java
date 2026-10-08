package n4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Loq/e;", "", "T", "Ln4/a;", "parentValue", "childValue", "c", "(Ln4/a;Ln4/a;)Ln4/a;"}, k = 3, mv = {2, 1, 0})
public final class e0 extends fr.w implements er.p<AccessibilityAction<oq.e<? extends Boolean>>, AccessibilityAction<oq.e<? extends Boolean>>, AccessibilityAction<oq.e<? extends Boolean>>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e0 f131227b = new e0();

    public e0() {
        super(2);
    }

    @Override // er.p
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final AccessibilityAction<oq.e<? extends Boolean>> B(AccessibilityAction<oq.e<? extends Boolean>> accessibilityAction, AccessibilityAction<oq.e<? extends Boolean>> accessibilityAction2) {
        String label;
        oq.e eVarA;
        if (accessibilityAction == null || (label = accessibilityAction.getLabel()) == null) {
            label = accessibilityAction2.getLabel();
        }
        if (accessibilityAction == null || (eVarA = accessibilityAction.a()) == null) {
            eVarA = accessibilityAction2.a();
        }
        return new AccessibilityAction<>(label, eVarA);
    }
}
