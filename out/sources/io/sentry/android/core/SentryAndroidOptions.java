package io.sentry.android.core;

import io.sentry.q7;
import io.sentry.w6;

/* JADX INFO: loaded from: classes4.dex */
public final class SentryAndroidOptions extends q7 {
    private boolean attachScreenshot;
    private boolean attachViewHierarchy;
    private b beforeScreenshotCaptureCallback;
    private b beforeViewHierarchyCaptureCallback;
    private io.sentry.android.core.internal.util.a0 frameMetricsCollector;
    private boolean anrEnabled = true;
    private long anrTimeoutIntervalMillis = 5000;
    private boolean anrReportInDebug = false;
    private boolean enableActivityLifecycleBreadcrumbs = true;
    private boolean enableAppLifecycleBreadcrumbs = true;
    private boolean enableSystemEventBreadcrumbs = true;
    private boolean enableAppComponentBreadcrumbs = true;
    private boolean enableNetworkEventBreadcrumbs = true;
    private boolean enableAutoActivityLifecycleTracing = true;
    private boolean enableActivityLifecycleTracingAutoFinish = true;
    private k1 debugImagesLoader = s1.a();
    private boolean collectAdditionalContext = true;
    private long startupCrashFlushTimeoutMillis = 5000;
    private final long startupCrashDurationThresholdMillis = 2000;
    private boolean enableFramesTracking = true;
    private String nativeSdkName = null;
    private boolean enableRootCheck = true;
    private boolean enableNdk = true;
    private r1 ndkHandlerStrategy = r1.SENTRY_HANDLER_STRATEGY_DEFAULT;
    private boolean enableScopeSync = true;
    private boolean enableAutoTraceIdGeneration = true;
    private boolean enableSystemEventBreadcrumbsExtras = false;
    private boolean reportHistoricalAnrs = false;
    private boolean attachAnrThreadDump = false;
    private boolean enablePerformanceV2 = true;

    static class a implements w6.a {
        a() {
        }
    }

    public interface b {
    }

    public SentryAndroidOptions() {
        setSentryClientName("sentry.java.android/8.22.0");
        setSdkVersion(createSdkVersion());
        setAttachServerName(false);
    }

    private io.sentry.protocol.p createSdkVersion() {
        io.sentry.protocol.p pVarK = io.sentry.protocol.p.k(getSdkVersion(), "sentry.java.android", "8.22.0");
        pVarK.c("maven:io.sentry:sentry-android-core", "8.22.0");
        return pVarK;
    }

    public void enableAllAutoBreadcrumbs(boolean z15) {
        this.enableActivityLifecycleBreadcrumbs = z15;
        this.enableAppComponentBreadcrumbs = z15;
        this.enableSystemEventBreadcrumbs = z15;
        this.enableAppLifecycleBreadcrumbs = z15;
        this.enableNetworkEventBreadcrumbs = z15;
        setEnableUserInteractionBreadcrumbs(z15);
    }

    public long getAnrTimeoutIntervalMillis() {
        return this.anrTimeoutIntervalMillis;
    }

    public b getBeforeScreenshotCaptureCallback() {
        return null;
    }

    public b getBeforeViewHierarchyCaptureCallback() {
        return null;
    }

    public k1 getDebugImagesLoader() {
        return this.debugImagesLoader;
    }

    public io.sentry.android.core.internal.util.a0 getFrameMetricsCollector() {
        return this.frameMetricsCollector;
    }

    public String getNativeSdkName() {
        return this.nativeSdkName;
    }

    public int getNdkHandlerStrategy() {
        return this.ndkHandlerStrategy.getValue();
    }

    public long getStartupCrashDurationThresholdMillis() {
        return 2000L;
    }

    long getStartupCrashFlushTimeoutMillis() {
        return this.startupCrashFlushTimeoutMillis;
    }

    public boolean isAnrEnabled() {
        return this.anrEnabled;
    }

    public boolean isAnrReportInDebug() {
        return this.anrReportInDebug;
    }

    public boolean isAttachAnrThreadDump() {
        return this.attachAnrThreadDump;
    }

    public boolean isAttachScreenshot() {
        return this.attachScreenshot;
    }

    public boolean isAttachViewHierarchy() {
        return this.attachViewHierarchy;
    }

    public boolean isCollectAdditionalContext() {
        return this.collectAdditionalContext;
    }

    public boolean isEnableActivityLifecycleBreadcrumbs() {
        return this.enableActivityLifecycleBreadcrumbs;
    }

    public boolean isEnableActivityLifecycleTracingAutoFinish() {
        return this.enableActivityLifecycleTracingAutoFinish;
    }

    public boolean isEnableAppComponentBreadcrumbs() {
        return this.enableAppComponentBreadcrumbs;
    }

    public boolean isEnableAppLifecycleBreadcrumbs() {
        return this.enableAppLifecycleBreadcrumbs;
    }

    public boolean isEnableAutoActivityLifecycleTracing() {
        return this.enableAutoActivityLifecycleTracing;
    }

    public boolean isEnableAutoTraceIdGeneration() {
        return this.enableAutoTraceIdGeneration;
    }

    public boolean isEnableFramesTracking() {
        return this.enableFramesTracking;
    }

    public boolean isEnableNdk() {
        return this.enableNdk;
    }

    public boolean isEnableNetworkEventBreadcrumbs() {
        return this.enableNetworkEventBreadcrumbs;
    }

    public boolean isEnablePerformanceV2() {
        return this.enablePerformanceV2;
    }

    public boolean isEnableRootCheck() {
        return this.enableRootCheck;
    }

    public boolean isEnableScopeSync() {
        return this.enableScopeSync;
    }

    public boolean isEnableSystemEventBreadcrumbs() {
        return this.enableSystemEventBreadcrumbs;
    }

    public boolean isEnableSystemEventBreadcrumbsExtras() {
        return this.enableSystemEventBreadcrumbsExtras;
    }

    public boolean isReportHistoricalAnrs() {
        return this.reportHistoricalAnrs;
    }

    public void setAnrEnabled(boolean z15) {
        this.anrEnabled = z15;
    }

    public void setAnrReportInDebug(boolean z15) {
        this.anrReportInDebug = z15;
    }

    public void setAnrTimeoutIntervalMillis(long j15) {
        this.anrTimeoutIntervalMillis = j15;
    }

    public void setAttachAnrThreadDump(boolean z15) {
        this.attachAnrThreadDump = z15;
    }

    public void setAttachScreenshot(boolean z15) {
        this.attachScreenshot = z15;
    }

    public void setAttachViewHierarchy(boolean z15) {
        this.attachViewHierarchy = z15;
    }

    public void setBeforeScreenshotCaptureCallback(b bVar) {
    }

    public void setBeforeViewHierarchyCaptureCallback(b bVar) {
    }

    public void setCollectAdditionalContext(boolean z15) {
        this.collectAdditionalContext = z15;
    }

    public void setDebugImagesLoader(k1 k1Var) {
        if (k1Var == null) {
            k1Var = s1.a();
        }
        this.debugImagesLoader = k1Var;
    }

    public void setEnableActivityLifecycleBreadcrumbs(boolean z15) {
        this.enableActivityLifecycleBreadcrumbs = z15;
    }

    public void setEnableActivityLifecycleTracingAutoFinish(boolean z15) {
        this.enableActivityLifecycleTracingAutoFinish = z15;
    }

    public void setEnableAppComponentBreadcrumbs(boolean z15) {
        this.enableAppComponentBreadcrumbs = z15;
    }

    public void setEnableAppLifecycleBreadcrumbs(boolean z15) {
        this.enableAppLifecycleBreadcrumbs = z15;
    }

    public void setEnableAutoActivityLifecycleTracing(boolean z15) {
        this.enableAutoActivityLifecycleTracing = z15;
    }

    public void setEnableAutoTraceIdGeneration(boolean z15) {
        this.enableAutoTraceIdGeneration = z15;
    }

    public void setEnableFramesTracking(boolean z15) {
        this.enableFramesTracking = z15;
    }

    public void setEnableNdk(boolean z15) {
        this.enableNdk = z15;
    }

    public void setEnableNetworkEventBreadcrumbs(boolean z15) {
        this.enableNetworkEventBreadcrumbs = z15;
    }

    public void setEnablePerformanceV2(boolean z15) {
        this.enablePerformanceV2 = z15;
    }

    public void setEnableRootCheck(boolean z15) {
        this.enableRootCheck = z15;
    }

    public void setEnableScopeSync(boolean z15) {
        this.enableScopeSync = z15;
    }

    public void setEnableSystemEventBreadcrumbs(boolean z15) {
        this.enableSystemEventBreadcrumbs = z15;
    }

    public void setEnableSystemEventBreadcrumbsExtras(boolean z15) {
        this.enableSystemEventBreadcrumbsExtras = z15;
    }

    public void setFrameMetricsCollector(io.sentry.android.core.internal.util.a0 a0Var) {
        this.frameMetricsCollector = a0Var;
    }

    public void setNativeHandlerStrategy(r1 r1Var) {
        this.ndkHandlerStrategy = r1Var;
    }

    public void setNativeSdkName(String str) {
        this.nativeSdkName = str;
    }

    public void setReportHistoricalAnrs(boolean z15) {
        this.reportHistoricalAnrs = z15;
    }

    void setStartupCrashFlushTimeoutMillis(long j15) {
        this.startupCrashFlushTimeoutMillis = j15;
    }
}
