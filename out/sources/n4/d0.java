package n4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\b¨\u0006\u000e"}, d2 = {"Ln4/d0;", "", "<init>", "()V", "Ln4/h0;", "", "b", "Ln4/h0;", "()Ln4/h0;", "TestTagsAsResourceId", "", "c", "a", "AccessibilityClassName", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f131217a = new d0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final h0<Boolean> TestTagsAsResourceId = new h0<>("TestTagsAsResourceId", false, b.f131222b, null, 8, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final h0<String> AccessibilityClassName = new h0<>("AccessibilityClassName", true, a.f131221b, null, 8, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f131220d = 8;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "parentValue", "<unused var>", "c", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 3, mv = {2, 1, 0})
    static final class a extends fr.w implements er.p<String, String, String> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f131221b = new a();

        a() {
            super(2);
        }

        @Override // er.p
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final String B(String str, String str2) {
            return str;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "parentValue", "<unused var>", "c", "(Ljava/lang/Boolean;Z)Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0})
    static final class b extends fr.w implements er.p<Boolean, Boolean, Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f131222b = new b();

        b() {
            super(2);
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Boolean B(Boolean bool, Boolean bool2) {
            return c(bool, bool2.booleanValue());
        }

        public final Boolean c(Boolean bool, boolean z15) {
            return bool;
        }
    }

    private d0() {
    }

    public final h0<String> a() {
        return AccessibilityClassName;
    }

    public final h0<Boolean> b() {
        return TestTagsAsResourceId;
    }
}
