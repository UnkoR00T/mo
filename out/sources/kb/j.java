package kb;

import android.annotation.SuppressLint;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"UnsafeOptInUsageError"})
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kb.a.b f109672a = new kb.a.b("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kb.a.b f109674b = new kb.a.b("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final kb.a.e f109676c = new kb.a.e("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final kb.a.c f109678d = new kb.a.c("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final kb.a.f f109680e = new kb.a.f("START_SAFE_BROWSING", "START_SAFE_BROWSING");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final kb.a.f f109682f = new kb.a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final kb.a.f f109684g = new kb.a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final kb.a.f f109686h = new kb.a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final kb.a.f f109688i = new kb.a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final kb.a.f f109690j = new kb.a.f("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final kb.a.c f109692k = new kb.a.c("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final kb.a.c f109694l = new kb.a.c("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final kb.a.c f109696m = new kb.a.c("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final kb.a.c f109698n = new kb.a.c("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final kb.a.c f109700o = new kb.a.c("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final kb.a.c f109702p = new kb.a.c("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final kb.a.b f109704q = new kb.a.b("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final kb.a.b f109706r = new kb.a.b("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final kb.a.c f109708s = new kb.a.c("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final kb.a.f f109710t = new kb.a.f("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final kb.a.c f109712u = new kb.a.c("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final kb.a.b f109714v = new kb.a.b("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final kb.a.b f109716w = new kb.a.b("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final kb.a.f f109718x = new kb.a.f("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final kb.a.f f109720y = new kb.a.f("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final kb.a.f f109722z = new kb.a.f("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");
    public static final kb.a.b A = new kb.a.b("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");
    public static final kb.a.b B = new kb.a.b("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");
    public static final kb.a.d C = new kb.a.d("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER");
    public static final kb.a.b D = new kb.a.b("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");
    public static final kb.a.b E = new kb.a.b("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");
    public static final kb.a.b F = new kb.a.b("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");
    public static final kb.a.b G = new kb.a.b("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");
    public static final kb.a.e H = new kb.a.e("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");
    public static final kb.a.e I = new kb.a.e("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");
    public static final kb.a.h J = new kb.a.h("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");
    public static final kb.a.h K = new kb.a.h("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");
    public static final kb.a.g L = new kb.a.g("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");
    public static final h.b M = new h.b("STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX", "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX");
    public static final h.a N = new h.a("STARTUP_FEATURE_SET_DIRECTORY_BASE_PATHS", "STARTUP_FEATURE_SET_DIRECTORY_BASE_PATH");
    public static final h.a O = new h.a("STARTUP_FEATURE_CONFIGURE_PARTITIONED_COOKIES", "STARTUP_FEATURE_CONFIGURE_PARTITIONED_COOKIES");
    public static final kb.a.h P = new kb.a.h("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");
    public static final kb.a.i Q = new a("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
    public static final kb.a.d R = new kb.a.d("PROXY_OVERRIDE", "PROXY_OVERRIDE:3");
    public static final kb.a.d S = new kb.a.d("MULTI_PROCESS", "MULTI_PROCESS_QUERY");
    public static final kb.a.h T = new kb.a.h("FORCE_DARK", "FORCE_DARK");
    public static final kb.a.d U = new kb.a.d("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR");
    public static final kb.a.d V = new kb.a.d("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");
    public static final kb.a.d W = new kb.a.d("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1");
    public static final kb.a.d X = new kb.a.d("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");
    public static final kb.a.d Y = new kb.a.d("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");
    public static final kb.a.d Z = new kb.a.d("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final kb.a.d f109673a0 = new kb.a.d("GET_COOKIE_INFO", "GET_COOKIE_INFO");

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @Deprecated(forRemoval = true)
    public static final kb.a.d f109675b0 = new kb.a.d("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST");

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final kb.a.d f109677c0 = new kb.a.d("USER_AGENT_METADATA", "USER_AGENT_METADATA");

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final kb.a.d f109679d0 = new b("USER_AGENT_METADATA_FORM_FACTORS", "USER_AGENT_METADATA");

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final kb.a.d f109681e0 = new c("MULTI_PROFILE", "MULTI_PROFILE");

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final kb.a.d f109683f0 = new kb.a.d("ATTRIBUTION_REGISTRATION_BEHAVIOR", "ATTRIBUTION_BEHAVIOR");

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final kb.a.d f109685g0 = new kb.a.d("WEBVIEW_MEDIA_INTEGRITY_API_STATUS", "WEBVIEW_INTEGRITY_API_STATUS");

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final kb.a.d f109687h0 = new kb.a.d("MUTE_AUDIO", "MUTE_AUDIO");

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final kb.a.d f109689i0 = new kb.a.d("WEB_AUTHENTICATION", "WEB_AUTHENTICATION");

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final kb.a.d f109691j0 = new kb.a.d("SPECULATIVE_LOADING_STATUS", "SPECULATIVE_LOADING");

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final kb.a.d f109693k0 = new kb.a.d("BACK_FORWARD_CACHE", "BACK_FORWARD_CACHE");

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final kb.a.d f109695l0 = new kb.a.d("BACK_FORWARD_CACHE_SETTINGS", "BACK_FORWARD_CACHE_SETTINGS");

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final kb.a.d f109697m0 = new kb.a.d("DELETE_BROWSING_DATA", "WEB_STORAGE_DELETE_BROWSING_DATA");

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final kb.a.d f109699n0 = new d("PREFETCH_URL_V5", "PREFETCH_URL_V5");

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final kb.a.d f109701o0 = new kb.a.d("IMPLEMENTATION_ONLY_FEATURE", "ASYNC_WEBVIEW_STARTUP");

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final kb.a.d f109703p0 = new kb.a.d("IMPLEMENTATION_ONLY_FEATURE", "ASYNC_WEBVIEW_STARTUP_ASYNC_STARTUP_LOCATIONS");

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final kb.a.d f109705q0 = new kb.a.d("DEFAULT_TRAFFICSTATS_TAGGING", "DEFAULT_TRAFFICSTATS_TAGGING");

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final kb.a.d f109707r0 = new kb.a.d("PRERENDER_URL_V2", "PRERENDER_URL_V3");

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final kb.a.d f109709s0 = new kb.a.d("SPECULATIVE_LOADING_CONFIG_V2", "SPECULATIVE_LOADING_CONFIG_V2");

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final kb.a.d f109711t0 = new kb.a.d("SAVE_STATE", "SAVE_STATE");

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final kb.a.d f109713u0 = new kb.a.d("WEB_VIEW_NAVIGATION_CLIENT_BASIC_USAGE", "WEB_VIEW_NAVIGATION_CLIENT_BASIC_USAGE");

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final kb.a.d f109715v0 = new kb.a.d("NAVIGATION_LISTENER_V1", "WEB_VIEW_NAVIGATION_LISTENER_V1");

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final kb.a.d f109717w0 = new kb.a.d("PROVIDER_WEAKLY_REF_WEBVIEW", "PROVIDER_WEAKLY_REF_WEBVIEW");

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final kb.a.d f109719x0 = new kb.a.d("PAYMENT_REQUEST", "PAYMENT_REQUEST");

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final kb.a.d f109721y0 = new kb.a.d("WEBVIEW_BUILDER_EXPERIMENTAL_V1", "WEBVIEW_BUILDER_V1");

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final kb.a.d f109723z0 = new kb.a.d("COOKIE_INTERCEPT", "COOKIE_INTERCEPT");
    public static final kb.a.d A0 = new kb.a.d("WARM_UP_RENDERER_PROCESS", "WARM_UP_RENDERER_PROCESS");
    public static final kb.a.d B0 = new kb.a.d("ORIGIN_MATCHED_HEADERS", "EXTRA_HEADER_FOR_ORIGINS");
    public static final kb.a.d C0 = new kb.a.d("CUSTOM_REQUEST_HEADERS", "CUSTOM_REQUEST_HEADERS");
    public static final h.a D0 = new h.a("STARTUP_FEATURE_SET_PROFILES_TO_LOAD", "STARTUP_FEATURE_SET_PROFILES_TO_LOAD");

    @Deprecated
    public static final h.a E0 = new h.a("STARTUP_FEATURE_SET_UI_THREAD_STARTUP_MODE", "STARTUP_FEATURE_SET_UI_THREAD_STARTUP_MODE");
    public static final h.a F0 = new h.a("STARTUP_FEATURE_SET_UI_THREAD_STARTUP_MODE_V2", "STARTUP_FEATURE_SET_UI_THREAD_STARTUP_MODE_V2");
    public static final kb.a.d G0 = new kb.a.d("PRECONNECT", "PRECONNECT");
    public static final kb.a.d H0 = new kb.a.d("ADD_QUIC_HINTS", "ADD_QUIC_HINTS_V1");
    public static final kb.a.d I0 = new kb.a.d("HYPERLINK_CONTEXT_MENU_ITEMS", "HYPERLINK_CONTEXT_MENU_ITEMS");

    class a extends kb.a.i {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Pattern f109724d;

        a(String str, String str2) {
            super(str, str2);
            this.f109724d = Pattern.compile("\\A\\d+");
        }

        @Override // kb.a
        public boolean d() {
            boolean zD = super.d();
            if (!zD || Build.VERSION.SDK_INT >= 29) {
                return zD;
            }
            PackageInfo packageInfoA = jb.c.a();
            if (packageInfoA == null) {
                return false;
            }
            Matcher matcher = this.f109724d.matcher(packageInfoA.versionName);
            return matcher.find() && Integer.parseInt(packageInfoA.versionName.substring(matcher.start(), matcher.end())) >= 105;
        }
    }

    class b extends kb.a.d {
        b(String str, String str2) {
            super(str, str2);
        }

        @Override // kb.a
        public boolean d() {
            PackageInfo packageInfoA;
            return super.d() && (packageInfoA = jb.c.a()) != null && v5.a.a(packageInfoA) >= 636700000;
        }
    }

    class c extends kb.a.d {
        c(String str, String str2) {
            super(str, str2);
        }

        @Override // kb.a
        public boolean d() {
            if (super.d() && jb.d.a("MULTI_PROCESS")) {
                return jb.c.c();
            }
            return false;
        }
    }

    class d extends kb.a.d {
        d(String str, String str2) {
            super(str, str2);
        }

        @Override // kb.a
        public boolean d() {
            if (jb.d.a("MULTI_PROFILE")) {
                return super.d();
            }
            return false;
        }
    }

    public static UnsupportedOperationException a() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static boolean b(String str) {
        return c(str, kb.a.e());
    }

    public static <T extends e> boolean c(String str, Collection<T> collection) {
        HashSet hashSet = new HashSet();
        for (T t15 : collection) {
            if (t15.b().equals(str)) {
                hashSet.add(t15);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature " + str);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((e) it.next()).a()) {
                return true;
            }
        }
        return false;
    }
}
