package io.sentry.android.replay;

import io.sentry.b7;
import io.sentry.z3;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\b*\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012¨\u0006\u0015"}, d2 = {"Lio/sentry/android/replay/a;", "Lio/sentry/z3;", "<init>", "()V", "Lio/sentry/f;", "", "c", "(Lio/sentry/f;)Z", "", "d", "(Ljava/lang/String;)Ljava/lang/String;", "Lio/sentry/rrweb/i;", "e", "(Lio/sentry/f;)Lio/sentry/rrweb/i;", "breadcrumb", "Lio/sentry/rrweb/b;", "a", "(Lio/sentry/f;)Lio/sentry/rrweb/b;", "Ljava/lang/String;", "lastConnectivityState", "b", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class a implements z3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f94276c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final oq.k<fu.o> f94277d = oq.l.b(oq.o.NONE, C2215a.f94280b);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final HashSet<String> f94278e;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String lastConnectivityState;

    /* JADX INFO: renamed from: io.sentry.android.replay.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lfu/o;", "c", "()Lfu/o;"}, k = 3, mv = {1, 9, 0})
    static final class C2215a extends fr.w implements er.a<fu.o> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C2215a f94280b = new C2215a();

        C2215a() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final fu.o a() {
            return new fu.o("_[a-z]");
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.a$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR$\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/sentry/android/replay/a$b;", "", "<init>", "()V", "Lfu/o;", "snakecasePattern$delegate", "Loq/k;", "b", "()Lfu/o;", "snakecasePattern", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "supportedNetworkData", "Ljava/util/HashSet;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final fu.o b() {
            return (fu.o) a.f94277d.getValue();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfu/l;", "it", "", "c", "(Lfu/l;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    static final class c extends fr.w implements er.l<fu.l, CharSequence> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f94281b = new c();

        c() {
            super(1);
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final CharSequence b(fu.l lVar) {
            return String.valueOf(fu.r.F1(lVar.getValue())).toUpperCase(Locale.ROOT);
        }
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("status_code");
        hashSet.add("method");
        hashSet.add("response_content_length");
        hashSet.add("request_content_length");
        hashSet.add("http.response_content_length");
        hashSet.add("http.request_content_length");
        f94278e = hashSet;
    }

    private final boolean c(io.sentry.f fVar) {
        Object obj = fVar.p().get("url");
        String str = obj instanceof String ? (String) obj : null;
        return str != null && str.length() != 0 && fVar.p().containsKey("http.start_timestamp") && fVar.p().containsKey("http.end_timestamp");
    }

    private final String d(String str) {
        return INSTANCE.b().g(str, c.f94281b);
    }

    private final io.sentry.rrweb.i e(io.sentry.f fVar) {
        Object obj = fVar.p().get("http.start_timestamp");
        Object obj2 = fVar.p().get("http.end_timestamp");
        io.sentry.rrweb.i iVar = new io.sentry.rrweb.i();
        iVar.f(fVar.s().getTime());
        iVar.s("resource.http");
        iVar.q((String) fVar.p().get("url"));
        iVar.u((obj instanceof Double ? ((Number) obj).doubleValue() : ((Long) obj).longValue()) / 1000.0d);
        iVar.r((obj2 instanceof Double ? ((Number) obj2).doubleValue() : ((Long) obj2).longValue()) / 1000.0d);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : fVar.p().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (f94278e.contains(key)) {
                linkedHashMap.put(d(fu.r.g1(fu.r.P(key, "content_length", "body_size", false, 4, null), ".", null, 2, null)), value);
            }
        }
        iVar.o(linkedHashMap);
        return iVar;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00c7  */
    @Override // io.sentry.z3
    public io.sentry.rrweb.b a(io.sentry.f breadcrumb) {
        String strR;
        b7 b7VarQ;
        Object obj;
        String strJ1;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (fr.t.c(breadcrumb.o(), "http")) {
            if (c(breadcrumb)) {
                return e(breadcrumb);
            }
            return null;
        }
        String strO = "navigation";
        if (fr.t.c(breadcrumb.t(), "navigation") && fr.t.c(breadcrumb.o(), "app.lifecycle")) {
            strO = "app." + breadcrumb.p().get("state");
        } else if (fr.t.c(breadcrumb.t(), "navigation") && fr.t.c(breadcrumb.o(), "device.orientation")) {
            strO = breadcrumb.o();
            Object obj2 = breadcrumb.p().get("position");
            if (!fr.t.c(obj2, "landscape") && !fr.t.c(obj2, "portrait")) {
                return null;
            }
            linkedHashMap.put("position", obj2);
        } else {
            if (!fr.t.c(breadcrumb.t(), "navigation")) {
                if (fr.t.c(breadcrumb.o(), "ui.click")) {
                    Object obj3 = breadcrumb.p().get("view.id");
                    if (obj3 == null && (obj3 = breadcrumb.p().get("view.tag")) == null) {
                        obj3 = breadcrumb.p().get("view.class");
                    }
                    strR = obj3 instanceof String ? (String) obj3 : null;
                    if (strR == null) {
                        return null;
                    }
                    linkedHashMap.putAll(breadcrumb.p());
                    strO = "ui.tap";
                    b7VarQ = null;
                } else if (fr.t.c(breadcrumb.t(), "system") && fr.t.c(breadcrumb.o(), "network.event")) {
                    if (!fr.t.c(breadcrumb.p().get("action"), "NETWORK_LOST")) {
                        if (breadcrumb.p().containsKey("network_type")) {
                            Object obj4 = breadcrumb.p().get("network_type");
                            String str = obj4 instanceof String ? (String) obj4 : null;
                            obj = (str == null || str.length() == 0) ? "offline" : breadcrumb.p().get("network_type");
                        }
                        return null;
                    }
                    linkedHashMap.put("state", obj);
                    if (fr.t.c(this.lastConnectivityState, linkedHashMap.get("state"))) {
                        return null;
                    }
                    Object obj5 = linkedHashMap.get("state");
                    this.lastConnectivityState = obj5 instanceof String ? (String) obj5 : null;
                    strO = "device.connectivity";
                } else if (fr.t.c(breadcrumb.p().get("action"), "BATTERY_CHANGED")) {
                    Map<String, Object> mapP = breadcrumb.p();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry<String, Object> entry : mapP.entrySet()) {
                        String key = entry.getKey();
                        if (fr.t.c(key, "level") || fr.t.c(key, "charging")) {
                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                        }
                    }
                    linkedHashMap.putAll(linkedHashMap2);
                    strO = "device.battery";
                } else {
                    strO = breadcrumb.o();
                    strR = breadcrumb.r();
                    b7VarQ = breadcrumb.q();
                    linkedHashMap.putAll(breadcrumb.p());
                }
                if (strO == null && strO.length() != 0) {
                    io.sentry.rrweb.a aVar = new io.sentry.rrweb.a();
                    aVar.f(breadcrumb.s().getTime());
                    aVar.r(breadcrumb.s().getTime() / 1000.0d);
                    aVar.s("default");
                    aVar.t(strO);
                    aVar.x(strR);
                    aVar.w(b7VarQ);
                    aVar.u(linkedHashMap);
                    return aVar;
                }
            }
            if (fr.t.c(breadcrumb.p().get("state"), "resumed")) {
                Object obj6 = breadcrumb.p().get("screen");
                String str2 = obj6 instanceof String ? (String) obj6 : null;
                if (str2 != null) {
                    strJ1 = fu.r.j1(str2, '.', null, 2, null);
                } else {
                    strJ1 = null;
                }
            } else if (breadcrumb.p().containsKey("to")) {
                Object obj7 = breadcrumb.p().get("to");
                if (obj7 instanceof String) {
                    strJ1 = (String) obj7;
                } else {
                    strJ1 = null;
                }
            } else {
                strJ1 = null;
            }
            if (strJ1 == null) {
                return null;
            }
            linkedHashMap.put("to", strJ1);
        }
        strR = null;
        b7VarQ = null;
        return strO == null ? null : null;
    }
}
