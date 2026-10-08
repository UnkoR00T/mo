package h2;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;
import java.util.List;
import p071kotlin.Metadata;
import p076m2.c6;
import p076m2.f6;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\b\u0004\n\u0002\b\r*\u0002\u001e\"\b\u0003\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0012B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R+\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0015\"\u0004\b\u001c\u0010\fR\u0016\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u0004\u0018\u00010\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010(\u001a\u00020\u0003*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0018\u0010*\u001a\u00020\u0003*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010'R\u0014\u0010-\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lh2/m1;", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "Lm2/f6;", "", "listenToTouchExplorationState", "listenToSwitchAccessState", "listenToVoiceAccessState", "<init>", "(ZZZ)V", "enabled", "Loq/i0;", "onAccessibilityStateChanged", "(Z)V", "Landroid/view/accessibility/AccessibilityManager;", "am", "B", "(Landroid/view/accessibility/AccessibilityManager;)V", ip.a.f96138c, "a", "Z", "getListenToSwitchAccessState", "()Z", "b", "getListenToVoiceAccessState", "<set-?>", "c", "Lm2/a3;", "t", "C", "accessibilityEnabled", "h2/m1$c", "d", "Lh2/m1$c;", "touchExplorationListener", "h2/m1$b", "e", "Lh2/m1$b;", "otherA11yServicesListener", "y", "(Landroid/view/accessibility/AccessibilityManager;)Z", "switchAccessEnabled", "A", "voiceAccessEnabled", "z", "()Ljava/lang/Boolean;", "value", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class m1 implements AccessibilityManager.AccessibilityStateChangeListener, f6<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean listenToSwitchAccessState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean listenToVoiceAccessState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p076m2.a3 accessibilityEnabled = c6.e(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final c touchExplorationListener;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final b otherA11yServicesListener;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lh2/m1$a;", "", "<init>", "()V", "Landroid/view/accessibility/AccessibilityManager;", "am", "Landroid/view/accessibility/AccessibilityManager$AccessibilityServicesStateChangeListener;", "listener", "Loq/i0;", "a", "(Landroid/view/accessibility/AccessibilityManager;Landroid/view/accessibility/AccessibilityManager$AccessibilityServicesStateChangeListener;)V", "b", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f79913a = new a();

        private a() {
        }

        public static final void a(AccessibilityManager am4, AccessibilityManager$AccessibilityServicesStateChangeListener listener) {
            am4.addAccessibilityServicesStateChangeListener(listener);
        }

        public static final void b(AccessibilityManager am4, AccessibilityManager$AccessibilityServicesStateChangeListener listener) {
            am4.removeAccessibilityServicesStateChangeListener(listener);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R+\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR+\u0010\u0011\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\r¨\u0006\u0012"}, d2 = {"h2/m1$b", "Landroid/view/accessibility/AccessibilityManager$AccessibilityServicesStateChangeListener;", "Landroid/view/accessibility/AccessibilityManager;", "am", "Loq/i0;", "onAccessibilityServicesStateChanged", "(Landroid/view/accessibility/AccessibilityManager;)V", "", "<set-?>", "a", "Lm2/a3;", "()Z", "c", "(Z)V", "switchAccessEnabled", "b", "d", "voiceAccessEnabled", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements AccessibilityManager$AccessibilityServicesStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final p076m2.a3 switchAccessEnabled;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final p076m2.a3 voiceAccessEnabled;

        b() {
            Boolean bool = Boolean.FALSE;
            this.switchAccessEnabled = c6.e(bool, null, 2, null);
            this.voiceAccessEnabled = c6.e(bool, null, 2, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean a() {
            return ((Boolean) this.switchAccessEnabled.getValue()).booleanValue();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean b() {
            return ((Boolean) this.voiceAccessEnabled.getValue()).booleanValue();
        }

        public final void c(boolean z15) {
            this.switchAccessEnabled.setValue(Boolean.valueOf(z15));
        }

        public final void d(boolean z15) {
            this.voiceAccessEnabled.setValue(Boolean.valueOf(z15));
        }

        public void onAccessibilityServicesStateChanged(AccessibilityManager am4) {
            c(m1.this.y(am4));
            d(m1.this.A(am4));
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R+\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"h2/m1$c", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "", "enabled", "Loq/i0;", "onTouchExplorationStateChanged", "(Z)V", "<set-?>", "a", "Lm2/a3;", "()Z", "b", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final p076m2.a3 enabled = c6.e(Boolean.FALSE, null, 2, null);

        c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final boolean a() {
            return ((Boolean) this.enabled.getValue()).booleanValue();
        }

        public final void b(boolean z15) {
            this.enabled.setValue(Boolean.valueOf(z15));
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean enabled) {
            b(enabled);
        }
    }

    public m1(boolean z15, boolean z16, boolean z17) {
        this.listenToSwitchAccessState = z16;
        this.listenToVoiceAccessState = z17;
        b bVar = null;
        this.touchExplorationListener = z15 ? new c() : null;
        if ((z16 || z17) && Build.VERSION.SDK_INT >= 33) {
            bVar = new b();
        }
        this.otherA11yServicesListener = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean A(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i15 = 0; i15 < size; i15++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i15).getSettingsActivityName();
            if (settingsActivityName != null && fu.r.b0(settingsActivityName, "VoiceAccess", true)) {
                return true;
            }
        }
        return false;
    }

    private final void C(boolean z15) {
        this.accessibilityEnabled.setValue(Boolean.valueOf(z15));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean t() {
        return ((Boolean) this.accessibilityEnabled.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean y(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i15 = 0; i15 < size; i15++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i15).getSettingsActivityName();
            if (settingsActivityName != null && fu.r.b0(settingsActivityName, "SwitchAccess", true)) {
                return true;
            }
        }
        return false;
    }

    public final void B(AccessibilityManager am4) {
        b bVar;
        C(am4.isEnabled());
        am4.addAccessibilityStateChangeListener(this);
        c cVar = this.touchExplorationListener;
        if (cVar != null) {
            cVar.b(am4.isTouchExplorationEnabled());
            am4.addTouchExplorationStateChangeListener(cVar);
        }
        if (Build.VERSION.SDK_INT < 33 || (bVar = this.otherA11yServicesListener) == null) {
            return;
        }
        bVar.c(y(am4));
        bVar.d(A(am4));
        a.a(am4, bVar);
    }

    public final void D(AccessibilityManager am4) {
        b bVar;
        am4.removeAccessibilityStateChangeListener(this);
        c cVar = this.touchExplorationListener;
        if (cVar != null) {
            am4.removeTouchExplorationStateChangeListener(cVar);
        }
        if (Build.VERSION.SDK_INT < 33 || (bVar = this.otherA11yServicesListener) == null) {
            return;
        }
        a.b(am4, bVar);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean enabled) {
        C(enabled);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0030  */
    @Override // p076m2.f6
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public Boolean getValue() {
        boolean z15;
        b bVar;
        b bVar2;
        if (t()) {
            c cVar = this.touchExplorationListener;
            z15 = true;
            if ((cVar == null || !cVar.a()) && ((!this.listenToSwitchAccessState || (bVar2 = this.otherA11yServicesListener) == null || !bVar2.a()) && (!this.listenToVoiceAccessState || (bVar = this.otherA11yServicesListener) == null || !bVar.b()))) {
                z15 = false;
            }
        } else {
            z15 = false;
        }
        return Boolean.valueOf(z15);
    }
}
