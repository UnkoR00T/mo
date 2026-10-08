package io.sentry;

import java.io.File;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes4.dex */
public class q7 {
    static final b7 DEFAULT_DIAGNOSTIC_LEVEL = b7.DEBUG;
    private static final String DEFAULT_ENVIRONMENT = "production";
    public static final String DEFAULT_PROPAGATION_TARGETS = ".*";
    private boolean attachServerName;
    private boolean attachStacktrace;
    private boolean attachThreads;
    private io.sentry.backpressure.b backpressureMonitor;
    private a beforeBreadcrumb;
    private b beforeEnvelopeCallback;
    private c beforeSend;
    private c beforeSendFeedback;
    private d beforeSendReplay;
    private e beforeSendTransaction;
    private final Set<String> bundleIds;
    private String cacheDirPath;
    private boolean captureOpenTelemetryEvents;
    io.sentry.clientreport.h clientReportRecorder;
    private io.sentry.j compositePerformanceCollector;
    private p0 connectionStatusProvider;
    private int connectionTimeoutMillis;
    private final List<String> contextTags;
    private q0 continuousProfiler;
    private f cron;
    private final io.sentry.util.r<o5> dateProvider;
    private long deadlineTimeout;
    private boolean debug;
    private io.sentry.internal.debugmeta.a debugMetaLoader;
    private j4 defaultScopeType;
    private final List<String> defaultTracePropagationTargets;
    private b7 diagnosticLevel;
    private String dist;
    private String distinctId;
    private g distribution;
    private r0 distributionController;
    private String dsn;
    private String dsnHash;
    private boolean enableAppStartProfiling;
    private boolean enableAutoSessionTracking;
    private boolean enableBackpressureHandling;
    private boolean enableDeduplication;
    private boolean enableExternalConfiguration;
    private boolean enablePrettySerializationOutput;
    private boolean enableScopePersistence;
    private boolean enableScreenTracking;
    private boolean enableShutdownHook;
    private boolean enableSpotlight;
    private boolean enableTimeToFullDisplayTracing;
    private boolean enableUncaughtExceptionHandler;
    private boolean enableUserInteractionBreadcrumbs;
    private boolean enableUserInteractionTracing;
    private boolean enabled;
    private io.sentry.cache.g envelopeDiskCache;
    private final io.sentry.util.r<s0> envelopeReader;
    private String environment;
    private final List<e0> eventProcessors;
    private f1 executorService;
    private final f0 experimental;
    private v0 fatalLogger;
    private w6 feedbackOptions;
    private long flushTimeoutMillis;
    private boolean forceInit;
    private i0 fullyDisplayedReporter;
    private final List<io.sentry.internal.gestures.a> gestureTargetLocators;
    private Boolean globalHubMode;
    private Long idleTimeout;
    private List<h0> ignoredCheckIns;
    private List<h0> ignoredErrors;
    private final Set<Class<? extends Throwable>> ignoredExceptionsForType;
    private List<h0> ignoredSpanOrigins;
    private List<h0> ignoredTransactions;
    private final List<String> inAppExcludes;
    private final List<String> inAppIncludes;
    private p1 initPriority;
    private q1 instrumenter;
    private final List<r1> integrations;
    private volatile a9 internalTracesSampler;
    protected final io.sentry.util.a lock;
    private v0 logger;
    private h logs;
    private long maxAttachmentSize;
    private int maxBreadcrumbs;
    private int maxCacheItems;
    private int maxDepth;
    private int maxQueueSize;
    private l maxRequestBodySize;
    private int maxSpans;
    private long maxTraceFileSize;
    private io.sentry.internal.modules.b modulesLoader;
    private final List<b1> observers;
    private i onDiscard;
    private k7 openTelemetryMode;
    private final List<w0> optionsObservers;
    private final io.sentry.util.r<x> parsedDsn;
    private final List<x0> performanceCollectors;
    private boolean printUncaughtStackTrace;
    private u3 profileLifecycle;
    private Double profileSessionSampleRate;
    private Double profilesSampleRate;
    private j profilesSampler;
    private int profilingTracesHz;
    private String proguardUuid;
    private boolean propagateTraceparent;
    private k proxy;
    private int readTimeoutMillis;
    private String release;
    private a4 replayController;
    private Double sampleRate;
    private io.sentry.protocol.p sdkVersion;
    private boolean sendClientReports;
    private boolean sendDefaultPii;
    private boolean sendModules;
    private String sentryClientName;
    private final io.sentry.util.r<h1> serializer;
    private String serverName;
    private long sessionFlushTimeoutMillis;
    private s7 sessionReplay;
    private long sessionTrackingIntervalMillis;
    private long shutdownTimeoutMillis;
    private i1 socketTagger;
    private k1 spanFactory;
    private String spotlightConnectionUrl;
    private SSLSocketFactory sslSocketFactory;
    private boolean startProfilerOnAppStart;
    private final Map<String, String> tags;
    private io.sentry.util.thread.a threadChecker;
    private boolean traceOptionsRequests;
    private List<String> tracePropagationTargets;
    private boolean traceSampling;
    private Double tracesSampleRate;
    private m tracesSampler;
    private m1 transactionProfiler;
    private n1 transportFactory;
    private io.sentry.transport.r transportGate;
    private o1 versionDetector;
    private final List<io.sentry.internal.viewhierarchy.a> viewHierarchyExporters;

    public interface a {
    }

    public interface b {
        void b(p5 p5Var, j0 j0Var);
    }

    public interface c {
    }

    public interface d {
    }

    public interface e {
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f95568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f95569b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f95570c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f95571d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Long f95572e;

        public Long a() {
            return this.f95568a;
        }

        public Long b() {
            return this.f95571d;
        }

        public Long c() {
            return this.f95569b;
        }

        public Long d() {
            return this.f95572e;
        }

        public String e() {
            return this.f95570c;
        }

        public void f(Long l15) {
            this.f95568a = l15;
        }

        public void g(Long l15) {
            this.f95571d = l15;
        }

        public void h(Long l15) {
            this.f95569b = l15;
        }

        public void i(Long l15) {
            this.f95572e = l15;
        }

        public void j(String str) {
            this.f95570c = str;
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f95573a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f95574b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f95575c = "";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f95576d = "https://sentry.io";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f95577e = null;
    }

    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f95578a = false;

        public interface a {
        }

        public a a() {
            return null;
        }

        public boolean b() {
            return this.f95578a;
        }

        public void c(boolean z15) {
            this.f95578a = z15;
        }
    }

    public interface i {
    }

    public interface j {
    }

    public static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f95579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f95580b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f95581c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f95582d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Proxy.Type f95583e;

        public k(String str, String str2, String str3, String str4) {
            this(str, str2, null, str3, str4);
        }

        public String a() {
            return this.f95579a;
        }

        public String b() {
            return this.f95582d;
        }

        public String c() {
            return this.f95580b;
        }

        public Proxy.Type d() {
            return this.f95583e;
        }

        public String e() {
            return this.f95581c;
        }

        public k(String str, String str2, Proxy.Type type, String str3, String str4) {
            this.f95579a = str;
            this.f95580b = str2;
            this.f95583e = type;
            this.f95581c = str3;
            this.f95582d = str4;
        }
    }

    public enum l {
        NONE,
        SMALL,
        MEDIUM,
        ALWAYS
    }

    public interface m {
    }

    public q7() {
        this(false);
    }

    public static /* synthetic */ o5 a() {
        return new h5();
    }

    private void addPackageInfo() {
        z6.d().b("maven:io.sentry:sentry", "8.22.0");
    }

    public static /* synthetic */ x b(q7 q7Var) {
        return new x(q7Var.dsn);
    }

    public static /* synthetic */ s0 c(q7 q7Var) {
        q7Var.getClass();
        return new z(q7Var.serializer.a());
    }

    private io.sentry.protocol.p createSdkVersion() {
        io.sentry.protocol.p pVar = new io.sentry.protocol.p("sentry.java", "8.22.0");
        pVar.j("8.22.0");
        return pVar;
    }

    public static /* synthetic */ h1 d(q7 q7Var) {
        q7Var.getClass();
        return new e2(q7Var);
    }

    public static q7 empty() {
        return new q7(true);
    }

    private /* synthetic */ void lambda$new$4(io.sentry.protocol.v vVar, w6.b bVar) {
        this.logger.c(b7.WARNING, "showDialog() can only be called in Android.", new Object[0]);
    }

    public void addBundleId(String str) {
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            this.bundleIds.add(strTrim);
        }
    }

    public void addContextTag(String str) {
        this.contextTags.add(str);
    }

    public void addEventProcessor(e0 e0Var) {
        this.eventProcessors.add(e0Var);
    }

    public void addIgnoredCheckIn(String str) {
        if (this.ignoredCheckIns == null) {
            this.ignoredCheckIns = new ArrayList();
        }
        this.ignoredCheckIns.add(new h0(str));
    }

    public void addIgnoredError(String str) {
        if (this.ignoredErrors == null) {
            this.ignoredErrors = new ArrayList();
        }
        this.ignoredErrors.add(new h0(str));
    }

    public void addIgnoredExceptionForType(Class<? extends Throwable> cls) {
        this.ignoredExceptionsForType.add(cls);
    }

    public void addIgnoredSpanOrigin(String str) {
        if (this.ignoredSpanOrigins == null) {
            this.ignoredSpanOrigins = new ArrayList();
        }
        this.ignoredSpanOrigins.add(new h0(str));
    }

    public void addIgnoredTransaction(String str) {
        if (this.ignoredTransactions == null) {
            this.ignoredTransactions = new ArrayList();
        }
        this.ignoredTransactions.add(new h0(str));
    }

    public void addInAppExclude(String str) {
        this.inAppExcludes.add(str);
    }

    public void addInAppInclude(String str) {
        this.inAppIncludes.add(str);
    }

    public void addIntegration(r1 r1Var) {
        this.integrations.add(r1Var);
    }

    public void addOptionsObserver(w0 w0Var) {
        this.optionsObservers.add(w0Var);
    }

    public void addPerformanceCollector(x0 x0Var) {
        this.performanceCollectors.add(x0Var);
    }

    public void addScopeObserver(b1 b1Var) {
        this.observers.add(b1Var);
    }

    boolean containsIgnoredExceptionForType(Throwable th4) {
        return this.ignoredExceptionsForType.contains(th4.getClass());
    }

    public io.sentry.cache.r findPersistingScopeObserver() {
        for (b1 b1Var : this.observers) {
            if (b1Var instanceof io.sentry.cache.r) {
                return (io.sentry.cache.r) b1Var;
            }
        }
        return null;
    }

    public io.sentry.backpressure.b getBackpressureMonitor() {
        return this.backpressureMonitor;
    }

    public a getBeforeBreadcrumb() {
        return null;
    }

    public b getBeforeEnvelopeCallback() {
        return this.beforeEnvelopeCallback;
    }

    public c getBeforeSend() {
        return null;
    }

    public c getBeforeSendFeedback() {
        return null;
    }

    public d getBeforeSendReplay() {
        return null;
    }

    public e getBeforeSendTransaction() {
        return null;
    }

    public Set<String> getBundleIds() {
        return this.bundleIds;
    }

    public String getCacheDirPath() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.dsnHash != null ? new File(this.cacheDirPath, this.dsnHash).getAbsolutePath() : this.cacheDirPath;
    }

    String getCacheDirPathWithoutDsn() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.cacheDirPath;
    }

    public io.sentry.clientreport.h getClientReportRecorder() {
        return this.clientReportRecorder;
    }

    public io.sentry.j getCompositePerformanceCollector() {
        return this.compositePerformanceCollector;
    }

    public p0 getConnectionStatusProvider() {
        return this.connectionStatusProvider;
    }

    public int getConnectionTimeoutMillis() {
        return this.connectionTimeoutMillis;
    }

    public List<String> getContextTags() {
        return this.contextTags;
    }

    public q0 getContinuousProfiler() {
        return this.continuousProfiler;
    }

    public f getCron() {
        return this.cron;
    }

    public o5 getDateProvider() {
        return this.dateProvider.a();
    }

    public long getDeadlineTimeout() {
        return this.deadlineTimeout;
    }

    public io.sentry.internal.debugmeta.a getDebugMetaLoader() {
        return this.debugMetaLoader;
    }

    public j4 getDefaultScopeType() {
        return this.defaultScopeType;
    }

    public b7 getDiagnosticLevel() {
        return this.diagnosticLevel;
    }

    public String getDist() {
        return this.dist;
    }

    public String getDistinctId() {
        return this.distinctId;
    }

    public g getDistribution() {
        return this.distribution;
    }

    public r0 getDistributionController() {
        return this.distributionController;
    }

    public String getDsn() {
        return this.dsn;
    }

    public io.sentry.cache.g getEnvelopeDiskCache() {
        return this.envelopeDiskCache;
    }

    public s0 getEnvelopeReader() {
        return this.envelopeReader.a();
    }

    public String getEnvironment() {
        String str = this.environment;
        return str != null ? str : DEFAULT_ENVIRONMENT;
    }

    public List<e0> getEventProcessors() {
        return this.eventProcessors;
    }

    public f1 getExecutorService() {
        return this.executorService;
    }

    public f0 getExperimental() {
        return this.experimental;
    }

    public v0 getFatalLogger() {
        return this.fatalLogger;
    }

    public w6 getFeedbackOptions() {
        return this.feedbackOptions;
    }

    public long getFlushTimeoutMillis() {
        return this.flushTimeoutMillis;
    }

    public i0 getFullyDisplayedReporter() {
        return this.fullyDisplayedReporter;
    }

    public List<io.sentry.internal.gestures.a> getGestureTargetLocators() {
        return this.gestureTargetLocators;
    }

    public Long getIdleTimeout() {
        return this.idleTimeout;
    }

    public List<h0> getIgnoredCheckIns() {
        return this.ignoredCheckIns;
    }

    public List<h0> getIgnoredErrors() {
        return this.ignoredErrors;
    }

    public Set<Class<? extends Throwable>> getIgnoredExceptionsForType() {
        return this.ignoredExceptionsForType;
    }

    public List<h0> getIgnoredSpanOrigins() {
        return this.ignoredSpanOrigins;
    }

    public List<h0> getIgnoredTransactions() {
        return this.ignoredTransactions;
    }

    public List<String> getInAppExcludes() {
        return this.inAppExcludes;
    }

    public List<String> getInAppIncludes() {
        return this.inAppIncludes;
    }

    public p1 getInitPriority() {
        return this.initPriority;
    }

    public q1 getInstrumenter() {
        return this.instrumenter;
    }

    public List<r1> getIntegrations() {
        return this.integrations;
    }

    public a9 getInternalTracesSampler() {
        if (this.internalTracesSampler == null) {
            g1 g1VarA = this.lock.a();
            try {
                if (this.internalTracesSampler == null) {
                    this.internalTracesSampler = new a9(this);
                }
                if (g1VarA != null) {
                    g1VarA.close();
                }
            } catch (Throwable th4) {
                if (g1VarA != null) {
                    try {
                        g1VarA.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        }
        return this.internalTracesSampler;
    }

    public v0 getLogger() {
        return this.logger;
    }

    public h getLogs() {
        return this.logs;
    }

    public long getMaxAttachmentSize() {
        return this.maxAttachmentSize;
    }

    public int getMaxBreadcrumbs() {
        return this.maxBreadcrumbs;
    }

    public int getMaxCacheItems() {
        return this.maxCacheItems;
    }

    public int getMaxDepth() {
        return this.maxDepth;
    }

    public int getMaxQueueSize() {
        return this.maxQueueSize;
    }

    public l getMaxRequestBodySize() {
        return this.maxRequestBodySize;
    }

    public int getMaxSpans() {
        return this.maxSpans;
    }

    public long getMaxTraceFileSize() {
        return this.maxTraceFileSize;
    }

    public io.sentry.internal.modules.b getModulesLoader() {
        return this.modulesLoader;
    }

    public i getOnDiscard() {
        return null;
    }

    public k7 getOpenTelemetryMode() {
        return this.openTelemetryMode;
    }

    public List<w0> getOptionsObservers() {
        return this.optionsObservers;
    }

    public String getOutboxPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "outbox").getAbsolutePath();
    }

    public List<x0> getPerformanceCollectors() {
        return this.performanceCollectors;
    }

    public u3 getProfileLifecycle() {
        return this.profileLifecycle;
    }

    public Double getProfileSessionSampleRate() {
        return this.profileSessionSampleRate;
    }

    public Double getProfilesSampleRate() {
        return this.profilesSampleRate;
    }

    public j getProfilesSampler() {
        return null;
    }

    public String getProfilingTracesDirPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "profiling_traces").getAbsolutePath();
    }

    public int getProfilingTracesHz() {
        return this.profilingTracesHz;
    }

    public String getProguardUuid() {
        return this.proguardUuid;
    }

    public k getProxy() {
        return this.proxy;
    }

    public int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public String getRelease() {
        return this.release;
    }

    public a4 getReplayController() {
        return this.replayController;
    }

    public Double getSampleRate() {
        return this.sampleRate;
    }

    public List<b1> getScopeObservers() {
        return this.observers;
    }

    public io.sentry.protocol.p getSdkVersion() {
        return this.sdkVersion;
    }

    public String getSentryClientName() {
        return this.sentryClientName;
    }

    public h1 getSerializer() {
        return this.serializer.a();
    }

    public String getServerName() {
        return this.serverName;
    }

    public long getSessionFlushTimeoutMillis() {
        return this.sessionFlushTimeoutMillis;
    }

    public s7 getSessionReplay() {
        return this.sessionReplay;
    }

    public long getSessionTrackingIntervalMillis() {
        return this.sessionTrackingIntervalMillis;
    }

    public long getShutdownTimeoutMillis() {
        return this.shutdownTimeoutMillis;
    }

    public i1 getSocketTagger() {
        return this.socketTagger;
    }

    public k1 getSpanFactory() {
        return this.spanFactory;
    }

    public String getSpotlightConnectionUrl() {
        return this.spotlightConnectionUrl;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public io.sentry.util.thread.a getThreadChecker() {
        return this.threadChecker;
    }

    public List<String> getTracePropagationTargets() {
        List<String> list = this.tracePropagationTargets;
        return list == null ? this.defaultTracePropagationTargets : list;
    }

    public Double getTracesSampleRate() {
        return this.tracesSampleRate;
    }

    public m getTracesSampler() {
        return null;
    }

    public m1 getTransactionProfiler() {
        return this.transactionProfiler;
    }

    public n1 getTransportFactory() {
        return this.transportFactory;
    }

    public io.sentry.transport.r getTransportGate() {
        return this.transportGate;
    }

    public o1 getVersionDetector() {
        return this.versionDetector;
    }

    public final List<io.sentry.internal.viewhierarchy.a> getViewHierarchyExporters() {
        return this.viewHierarchyExporters;
    }

    public boolean isAttachServerName() {
        return this.attachServerName;
    }

    public boolean isAttachStacktrace() {
        return this.attachStacktrace;
    }

    public boolean isAttachThreads() {
        return this.attachThreads;
    }

    public boolean isCaptureOpenTelemetryEvents() {
        return this.captureOpenTelemetryEvents;
    }

    public boolean isContinuousProfilingEnabled() {
        Double d15;
        return this.profilesSampleRate == null && (d15 = this.profileSessionSampleRate) != null && d15.doubleValue() > 0.0d;
    }

    public boolean isDebug() {
        return this.debug;
    }

    public boolean isEnableAppStartProfiling() {
        return (isProfilingEnabled() || isContinuousProfilingEnabled()) && this.enableAppStartProfiling;
    }

    public boolean isEnableAutoSessionTracking() {
        return this.enableAutoSessionTracking;
    }

    public boolean isEnableBackpressureHandling() {
        return this.enableBackpressureHandling;
    }

    public boolean isEnableDeduplication() {
        return this.enableDeduplication;
    }

    public boolean isEnableExternalConfiguration() {
        return this.enableExternalConfiguration;
    }

    public boolean isEnablePrettySerializationOutput() {
        return this.enablePrettySerializationOutput;
    }

    public boolean isEnableScopePersistence() {
        return this.enableScopePersistence;
    }

    public boolean isEnableScreenTracking() {
        return this.enableScreenTracking;
    }

    public boolean isEnableShutdownHook() {
        return this.enableShutdownHook;
    }

    public boolean isEnableSpotlight() {
        return this.enableSpotlight;
    }

    public boolean isEnableTimeToFullDisplayTracing() {
        return this.enableTimeToFullDisplayTracing;
    }

    public boolean isEnableUncaughtExceptionHandler() {
        return this.enableUncaughtExceptionHandler;
    }

    public boolean isEnableUserInteractionBreadcrumbs() {
        return this.enableUserInteractionBreadcrumbs;
    }

    public boolean isEnableUserInteractionTracing() {
        return this.enableUserInteractionTracing;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public boolean isForceInit() {
        return this.forceInit;
    }

    public Boolean isGlobalHubMode() {
        return this.globalHubMode;
    }

    public boolean isPrintUncaughtStackTrace() {
        return this.printUncaughtStackTrace;
    }

    public boolean isProfilingEnabled() {
        Double d15 = this.profilesSampleRate;
        return d15 != null && d15.doubleValue() > 0.0d;
    }

    public boolean isPropagateTraceparent() {
        return this.propagateTraceparent;
    }

    public boolean isSendClientReports() {
        return this.sendClientReports;
    }

    public boolean isSendDefaultPii() {
        return this.sendDefaultPii;
    }

    public boolean isSendModules() {
        return this.sendModules;
    }

    public boolean isStartProfilerOnAppStart() {
        return this.startProfilerOnAppStart;
    }

    public boolean isTraceOptionsRequests() {
        return this.traceOptionsRequests;
    }

    public boolean isTraceSampling() {
        return this.traceSampling;
    }

    public boolean isTracingEnabled() {
        if (getTracesSampleRate() != null) {
            return true;
        }
        getTracesSampler();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void loadLazyFields() {
        getSerializer();
        retrieveParsedDsn();
        getEnvelopeReader();
        getDateProvider();
    }

    public void merge(g0 g0Var) {
        if (g0Var.m() != null) {
            setDsn(g0Var.m());
        }
        if (g0Var.p() != null) {
            setEnvironment(g0Var.p());
        }
        if (g0Var.C() != null) {
            setRelease(g0Var.C());
        }
        if (g0Var.l() != null) {
            setDist(g0Var.l());
        }
        if (g0Var.E() != null) {
            setServerName(g0Var.E());
        }
        if (g0Var.B() != null) {
            setProxy(g0Var.B());
        }
        if (g0Var.o() != null) {
            setEnableUncaughtExceptionHandler(g0Var.o().booleanValue());
        }
        if (g0Var.y() != null) {
            setPrintUncaughtStackTrace(g0Var.y().booleanValue());
        }
        if (g0Var.I() != null) {
            setTracesSampleRate(g0Var.I());
        }
        if (g0Var.z() != null) {
            setProfilesSampleRate(g0Var.z());
        }
        if (g0Var.k() != null) {
            setDebug(g0Var.k().booleanValue());
        }
        if (g0Var.n() != null) {
            setEnableDeduplication(g0Var.n().booleanValue());
        }
        if (g0Var.D() != null) {
            setSendClientReports(g0Var.D().booleanValue());
        }
        if (g0Var.P() != null) {
            setForceInit(g0Var.P().booleanValue());
        }
        for (Map.Entry entry : new HashMap(g0Var.G()).entrySet()) {
            this.tags.put((String) entry.getKey(), (String) entry.getValue());
        }
        Iterator it = new ArrayList(g0Var.w()).iterator();
        while (it.hasNext()) {
            addInAppInclude((String) it.next());
        }
        Iterator it4 = new ArrayList(g0Var.v()).iterator();
        while (it4.hasNext()) {
            addInAppExclude((String) it4.next());
        }
        Iterator it5 = new HashSet(g0Var.t()).iterator();
        while (it5.hasNext()) {
            addIgnoredExceptionForType((Class) it5.next());
        }
        if (g0Var.H() != null) {
            setTracePropagationTargets(new ArrayList(g0Var.H()));
        }
        Iterator it6 = new ArrayList(g0Var.i()).iterator();
        while (it6.hasNext()) {
            addContextTag((String) it6.next());
        }
        if (g0Var.A() != null) {
            setProguardUuid(g0Var.A());
        }
        if (g0Var.q() != null) {
            setIdleTimeout(g0Var.q());
        }
        Iterator<String> it7 = g0Var.h().iterator();
        while (it7.hasNext()) {
            addBundleId(it7.next());
        }
        if (g0Var.O() != null) {
            setEnabled(g0Var.O().booleanValue());
        }
        if (g0Var.M() != null) {
            setEnablePrettySerializationOutput(g0Var.M().booleanValue());
        }
        if (g0Var.S() != null) {
            setSendModules(g0Var.S().booleanValue());
        }
        if (g0Var.r() != null) {
            setIgnoredCheckIns(new ArrayList(g0Var.r()));
        }
        if (g0Var.u() != null) {
            setIgnoredTransactions(new ArrayList(g0Var.u()));
        }
        if (g0Var.s() != null) {
            setIgnoredErrors(new ArrayList(g0Var.s()));
        }
        if (g0Var.K() != null) {
            setEnableBackpressureHandling(g0Var.K().booleanValue());
        }
        if (g0Var.x() != null) {
            setMaxRequestBodySize(g0Var.x());
        }
        if (g0Var.R() != null) {
            setSendDefaultPii(g0Var.R().booleanValue());
        }
        if (g0Var.J() != null) {
            setCaptureOpenTelemetryEvents(g0Var.J().booleanValue());
        }
        if (g0Var.N() != null) {
            setEnableSpotlight(g0Var.N().booleanValue());
        }
        if (g0Var.F() != null) {
            setSpotlightConnectionUrl(g0Var.F());
        }
        if (g0Var.Q() != null) {
            setGlobalHubMode(g0Var.Q());
        }
        if (g0Var.j() != null) {
            if (getCron() == null) {
                setCron(g0Var.j());
            } else {
                if (g0Var.j().a() != null) {
                    getCron().f(g0Var.j().a());
                }
                if (g0Var.j().c() != null) {
                    getCron().h(g0Var.j().c());
                }
                if (g0Var.j().e() != null) {
                    getCron().j(g0Var.j().e());
                }
                if (g0Var.j().b() != null) {
                    getCron().g(g0Var.j().b());
                }
                if (g0Var.j().d() != null) {
                    getCron().i(g0Var.j().d());
                }
            }
        }
        if (g0Var.L() != null) {
            getLogs().c(g0Var.L().booleanValue());
        }
    }

    x retrieveParsedDsn() {
        return this.parsedDsn.a();
    }

    public void setAttachServerName(boolean z15) {
        this.attachServerName = z15;
    }

    public void setAttachStacktrace(boolean z15) {
        this.attachStacktrace = z15;
    }

    public void setAttachThreads(boolean z15) {
        this.attachThreads = z15;
    }

    public void setBackpressureMonitor(io.sentry.backpressure.b bVar) {
        this.backpressureMonitor = bVar;
    }

    public void setBeforeBreadcrumb(a aVar) {
    }

    public void setBeforeEnvelopeCallback(b bVar) {
        this.beforeEnvelopeCallback = bVar;
    }

    public void setBeforeSend(c cVar) {
    }

    public void setBeforeSendFeedback(c cVar) {
    }

    public void setBeforeSendReplay(d dVar) {
    }

    public void setBeforeSendTransaction(e eVar) {
    }

    public void setCacheDirPath(String str) {
        this.cacheDirPath = str;
    }

    public void setCaptureOpenTelemetryEvents(boolean z15) {
        this.captureOpenTelemetryEvents = z15;
    }

    public void setCompositePerformanceCollector(io.sentry.j jVar) {
        this.compositePerformanceCollector = jVar;
    }

    public void setConnectionStatusProvider(p0 p0Var) {
        this.connectionStatusProvider = p0Var;
    }

    public void setConnectionTimeoutMillis(int i15) {
        this.connectionTimeoutMillis = i15;
    }

    public void setContinuousProfiler(q0 q0Var) {
        if (this.continuousProfiler != l2.a() || q0Var == null) {
            return;
        }
        this.continuousProfiler = q0Var;
    }

    public void setCron(f fVar) {
        this.cron = fVar;
    }

    public void setDateProvider(o5 o5Var) {
        this.dateProvider.c(o5Var);
    }

    public void setDeadlineTimeout(long j15) {
        this.deadlineTimeout = j15;
    }

    public void setDebug(boolean z15) {
        this.debug = z15;
    }

    public void setDebugMetaLoader(io.sentry.internal.debugmeta.a aVar) {
        if (aVar == null) {
            aVar = io.sentry.internal.debugmeta.b.b();
        }
        this.debugMetaLoader = aVar;
    }

    public void setDefaultScopeType(j4 j4Var) {
        this.defaultScopeType = j4Var;
    }

    public void setDiagnosticLevel(b7 b7Var) {
        if (b7Var == null) {
            b7Var = DEFAULT_DIAGNOSTIC_LEVEL;
        }
        this.diagnosticLevel = b7Var;
    }

    public void setDist(String str) {
        this.dist = str;
    }

    public void setDistinctId(String str) {
        this.distinctId = str;
    }

    public void setDistribution(g gVar) {
        if (gVar == null) {
            gVar = new g();
        }
        this.distribution = gVar;
    }

    public void setDistributionController(r0 r0Var) {
        if (r0Var == null) {
            r0Var = m2.a();
        }
        this.distributionController = r0Var;
    }

    public void setDsn(String str) {
        this.dsn = str;
        this.parsedDsn.b();
        this.dsnHash = io.sentry.util.d0.b(this.dsn, this.logger);
    }

    public void setEnableAppStartProfiling(boolean z15) {
        this.enableAppStartProfiling = z15;
    }

    public void setEnableAutoSessionTracking(boolean z15) {
        this.enableAutoSessionTracking = z15;
    }

    public void setEnableBackpressureHandling(boolean z15) {
        this.enableBackpressureHandling = z15;
    }

    public void setEnableDeduplication(boolean z15) {
        this.enableDeduplication = z15;
    }

    public void setEnableExternalConfiguration(boolean z15) {
        this.enableExternalConfiguration = z15;
    }

    public void setEnablePrettySerializationOutput(boolean z15) {
        this.enablePrettySerializationOutput = z15;
    }

    public void setEnableScopePersistence(boolean z15) {
        this.enableScopePersistence = z15;
    }

    public void setEnableScreenTracking(boolean z15) {
        this.enableScreenTracking = z15;
    }

    public void setEnableShutdownHook(boolean z15) {
        this.enableShutdownHook = z15;
    }

    public void setEnableSpotlight(boolean z15) {
        this.enableSpotlight = z15;
    }

    public void setEnableTimeToFullDisplayTracing(boolean z15) {
        this.enableTimeToFullDisplayTracing = z15;
    }

    public void setEnableUncaughtExceptionHandler(boolean z15) {
        this.enableUncaughtExceptionHandler = z15;
    }

    public void setEnableUserInteractionBreadcrumbs(boolean z15) {
        this.enableUserInteractionBreadcrumbs = z15;
    }

    public void setEnableUserInteractionTracing(boolean z15) {
        this.enableUserInteractionTracing = z15;
    }

    public void setEnabled(boolean z15) {
        this.enabled = z15;
    }

    public void setEnvelopeDiskCache(io.sentry.cache.g gVar) {
        if (gVar == null) {
            gVar = io.sentry.transport.s.e();
        }
        this.envelopeDiskCache = gVar;
    }

    public void setEnvelopeReader(s0 s0Var) {
        io.sentry.util.r<s0> rVar = this.envelopeReader;
        if (s0Var == null) {
            s0Var = n2.b();
        }
        rVar.c(s0Var);
    }

    public void setEnvironment(String str) {
        this.environment = str;
    }

    public void setExecutorService(f1 f1Var) {
        if (f1Var != null) {
            this.executorService = f1Var;
        }
    }

    public void setFatalLogger(v0 v0Var) {
        if (v0Var == null) {
            v0Var = p2.e();
        }
        this.fatalLogger = v0Var;
    }

    public void setFeedbackOptions(w6 w6Var) {
        this.feedbackOptions = w6Var;
    }

    public void setFlushTimeoutMillis(long j15) {
        this.flushTimeoutMillis = j15;
    }

    public void setForceInit(boolean z15) {
        this.forceInit = z15;
    }

    public void setFullyDisplayedReporter(i0 i0Var) {
        this.fullyDisplayedReporter = i0Var;
    }

    public void setGestureTargetLocators(List<io.sentry.internal.gestures.a> list) {
        this.gestureTargetLocators.clear();
        this.gestureTargetLocators.addAll(list);
    }

    public void setGlobalHubMode(Boolean bool) {
        this.globalHubMode = bool;
    }

    public void setIdleTimeout(Long l15) {
        this.idleTimeout = l15;
    }

    public void setIgnoredCheckIns(List<String> list) {
        if (list == null) {
            this.ignoredCheckIns = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(new h0(str));
            }
        }
        this.ignoredCheckIns = arrayList;
    }

    public void setIgnoredErrors(List<String> list) {
        if (list == null) {
            this.ignoredErrors = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new h0(str));
            }
        }
        this.ignoredErrors = arrayList;
    }

    public void setIgnoredSpanOrigins(List<String> list) {
        if (list == null) {
            this.ignoredSpanOrigins = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new h0(str));
            }
        }
        this.ignoredSpanOrigins = arrayList;
    }

    public void setIgnoredTransactions(List<String> list) {
        if (list == null) {
            this.ignoredTransactions = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new h0(str));
            }
        }
        this.ignoredTransactions = arrayList;
    }

    public void setInitPriority(p1 p1Var) {
        this.initPriority = p1Var;
    }

    @Deprecated
    public void setInstrumenter(q1 q1Var) {
        this.instrumenter = q1Var;
    }

    public void setLogger(v0 v0Var) {
        this.logger = v0Var == null ? p2.e() : new t(this, v0Var);
    }

    public void setLogs(h hVar) {
        this.logs = hVar;
    }

    public void setMaxAttachmentSize(long j15) {
        this.maxAttachmentSize = j15;
    }

    public void setMaxBreadcrumbs(int i15) {
        this.maxBreadcrumbs = i15;
    }

    public void setMaxCacheItems(int i15) {
        this.maxCacheItems = i15;
    }

    public void setMaxDepth(int i15) {
        this.maxDepth = i15;
    }

    public void setMaxQueueSize(int i15) {
        if (i15 > 0) {
            this.maxQueueSize = i15;
        }
    }

    public void setMaxRequestBodySize(l lVar) {
        this.maxRequestBodySize = lVar;
    }

    public void setMaxSpans(int i15) {
        this.maxSpans = i15;
    }

    public void setMaxTraceFileSize(long j15) {
        this.maxTraceFileSize = j15;
    }

    public void setModulesLoader(io.sentry.internal.modules.b bVar) {
        if (bVar == null) {
            bVar = io.sentry.internal.modules.e.b();
        }
        this.modulesLoader = bVar;
    }

    public void setOnDiscard(i iVar) {
    }

    public void setOpenTelemetryMode(k7 k7Var) {
        this.openTelemetryMode = k7Var;
    }

    public void setPrintUncaughtStackTrace(boolean z15) {
        this.printUncaughtStackTrace = z15;
    }

    public void setProfileLifecycle(u3 u3Var) {
        this.profileLifecycle = u3Var;
        if (u3Var != u3.TRACE || isTracingEnabled()) {
            return;
        }
        this.logger.c(b7.WARNING, "Profiling lifecycle is set to TRACE but tracing is disabled. Profiling will not be started automatically.", new Object[0]);
    }

    public void setProfileSessionSampleRate(Double d15) {
        if (io.sentry.util.a0.c(d15)) {
            this.profileSessionSampleRate = d15;
            return;
        }
        throw new IllegalArgumentException("The value " + d15 + " is not valid. Use values between 0.0 and 1.0.");
    }

    public void setProfilesSampleRate(Double d15) {
        if (io.sentry.util.a0.d(d15)) {
            this.profilesSampleRate = d15;
            return;
        }
        throw new IllegalArgumentException("The value " + d15 + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setProfilesSampler(j jVar) {
    }

    public void setProfilingTracesHz(int i15) {
        this.profilingTracesHz = i15;
    }

    public void setProguardUuid(String str) {
        this.proguardUuid = str;
    }

    public void setPropagateTraceparent(boolean z15) {
        this.propagateTraceparent = z15;
    }

    public void setProxy(k kVar) {
        this.proxy = kVar;
    }

    public void setReadTimeoutMillis(int i15) {
        this.readTimeoutMillis = i15;
    }

    public void setRelease(String str) {
        this.release = str;
    }

    public void setReplayController(a4 a4Var) {
        if (a4Var == null) {
            a4Var = r2.a();
        }
        this.replayController = a4Var;
    }

    public void setSampleRate(Double d15) {
        if (io.sentry.util.a0.f(d15)) {
            this.sampleRate = d15;
            return;
        }
        throw new IllegalArgumentException("The value " + d15 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public void setSdkVersion(io.sentry.protocol.p pVar) {
        io.sentry.protocol.p pVarI = getSessionReplay().i();
        io.sentry.protocol.p pVar2 = this.sdkVersion;
        if (pVar2 != null && pVarI != null && pVar2.equals(pVarI)) {
            getSessionReplay().w(pVar);
        }
        this.sdkVersion = pVar;
    }

    public void setSendClientReports(boolean z15) {
        this.sendClientReports = z15;
        if (z15) {
            this.clientReportRecorder = new io.sentry.clientreport.e(this);
        } else {
            this.clientReportRecorder = new io.sentry.clientreport.j();
        }
    }

    public void setSendDefaultPii(boolean z15) {
        this.sendDefaultPii = z15;
    }

    public void setSendModules(boolean z15) {
        this.sendModules = z15;
    }

    public void setSentryClientName(String str) {
        this.sentryClientName = str;
    }

    public void setSerializer(h1 h1Var) {
        io.sentry.util.r<h1> rVar = this.serializer;
        if (h1Var == null) {
            h1Var = c3.g();
        }
        rVar.c(h1Var);
    }

    public void setServerName(String str) {
        this.serverName = str;
    }

    public void setSessionFlushTimeoutMillis(long j15) {
        this.sessionFlushTimeoutMillis = j15;
    }

    public void setSessionReplay(s7 s7Var) {
        this.sessionReplay = s7Var;
    }

    public void setSessionTrackingIntervalMillis(long j15) {
        this.sessionTrackingIntervalMillis = j15;
    }

    public void setShutdownTimeoutMillis(long j15) {
        this.shutdownTimeoutMillis = j15;
    }

    public void setSocketTagger(i1 i1Var) {
        if (i1Var == null) {
            i1Var = d3.c();
        }
        this.socketTagger = i1Var;
    }

    public void setSpanFactory(k1 k1Var) {
        this.spanFactory = k1Var;
    }

    public void setSpotlightConnectionUrl(String str) {
        this.spotlightConnectionUrl = str;
    }

    public void setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.sslSocketFactory = sSLSocketFactory;
    }

    public void setStartProfilerOnAppStart(boolean z15) {
        this.startProfilerOnAppStart = z15;
    }

    public void setTag(String str, String str2) {
        if (str == null) {
            return;
        }
        if (str2 == null) {
            this.tags.remove(str);
        } else {
            this.tags.put(str, str2);
        }
    }

    public void setThreadChecker(io.sentry.util.thread.a aVar) {
        this.threadChecker = aVar;
    }

    public void setTraceOptionsRequests(boolean z15) {
        this.traceOptionsRequests = z15;
    }

    public void setTracePropagationTargets(List<String> list) {
        if (list == null) {
            this.tracePropagationTargets = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(str);
            }
        }
        this.tracePropagationTargets = arrayList;
    }

    @Deprecated
    public void setTraceSampling(boolean z15) {
        this.traceSampling = z15;
    }

    public void setTracesSampleRate(Double d15) {
        if (io.sentry.util.a0.g(d15)) {
            this.tracesSampleRate = d15;
            return;
        }
        throw new IllegalArgumentException("The value " + d15 + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setTracesSampler(m mVar) {
    }

    public void setTransactionProfiler(m1 m1Var) {
        if (this.transactionProfiler != h3.c() || m1Var == null) {
            return;
        }
        this.transactionProfiler = m1Var;
    }

    public void setTransportFactory(n1 n1Var) {
        if (n1Var == null) {
            n1Var = i3.b();
        }
        this.transportFactory = n1Var;
    }

    public void setTransportGate(io.sentry.transport.r rVar) {
        if (rVar == null) {
            rVar = io.sentry.transport.u.a();
        }
        this.transportGate = rVar;
    }

    public void setVersionDetector(o1 o1Var) {
        this.versionDetector = o1Var;
    }

    public void setViewHierarchyExporters(List<io.sentry.internal.viewhierarchy.a> list) {
        this.viewHierarchyExporters.clear();
        this.viewHierarchyExporters.addAll(list);
    }

    private q7(boolean z15) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.eventProcessors = copyOnWriteArrayList;
        this.ignoredExceptionsForType = new CopyOnWriteArraySet();
        this.ignoredErrors = null;
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        this.integrations = copyOnWriteArrayList2;
        this.bundleIds = new CopyOnWriteArraySet();
        this.parsedDsn = new io.sentry.util.r<>(new io.sentry.util.r.a() { // from class: io.sentry.l7
            @Override // io.sentry.util.r.a
            public final Object a() {
                return q7.b(this.f95156a);
            }
        });
        this.shutdownTimeoutMillis = 2000L;
        this.flushTimeoutMillis = 15000L;
        this.sessionFlushTimeoutMillis = 15000L;
        this.logger = p2.e();
        this.fatalLogger = p2.e();
        this.diagnosticLevel = DEFAULT_DIAGNOSTIC_LEVEL;
        this.serializer = new io.sentry.util.r<>(new io.sentry.util.r.a() { // from class: io.sentry.m7
            @Override // io.sentry.util.r.a
            public final Object a() {
                return q7.d(this.f95194a);
            }
        });
        this.envelopeReader = new io.sentry.util.r<>(new io.sentry.util.r.a() { // from class: io.sentry.n7
            @Override // io.sentry.util.r.a
            public final Object a() {
                return q7.c(this.f95217a);
            }
        });
        this.maxDepth = 100;
        this.maxCacheItems = 30;
        this.maxQueueSize = 30;
        this.maxBreadcrumbs = 100;
        this.inAppExcludes = new CopyOnWriteArrayList();
        this.inAppIncludes = new CopyOnWriteArrayList();
        this.transportFactory = i3.b();
        this.transportGate = io.sentry.transport.u.a();
        this.attachStacktrace = true;
        this.enableAutoSessionTracking = true;
        this.sessionTrackingIntervalMillis = 30000L;
        this.attachServerName = true;
        this.enableUncaughtExceptionHandler = true;
        this.printUncaughtStackTrace = false;
        this.executorService = b3.f();
        this.connectionTimeoutMillis = 30000;
        this.readTimeoutMillis = 30000;
        this.envelopeDiskCache = io.sentry.transport.s.e();
        this.sendDefaultPii = false;
        this.observers = new CopyOnWriteArrayList();
        this.optionsObservers = new CopyOnWriteArrayList();
        this.tags = new ConcurrentHashMap();
        this.maxAttachmentSize = 20971520L;
        this.enableDeduplication = true;
        this.maxSpans = 1000;
        this.enableShutdownHook = true;
        this.maxRequestBodySize = l.NONE;
        this.traceSampling = true;
        this.maxTraceFileSize = 5242880L;
        this.transactionProfiler = h3.c();
        this.continuousProfiler = l2.a();
        this.tracePropagationTargets = null;
        this.defaultTracePropagationTargets = Collections.singletonList(DEFAULT_PROPAGATION_TARGETS);
        this.propagateTraceparent = false;
        this.idleTimeout = 3000L;
        this.contextTags = new CopyOnWriteArrayList();
        this.sendClientReports = true;
        this.clientReportRecorder = new io.sentry.clientreport.e(this);
        this.modulesLoader = io.sentry.internal.modules.e.b();
        this.debugMetaLoader = io.sentry.internal.debugmeta.b.b();
        this.enableUserInteractionTracing = false;
        this.enableUserInteractionBreadcrumbs = true;
        this.instrumenter = q1.SENTRY;
        this.gestureTargetLocators = new ArrayList();
        this.viewHierarchyExporters = new ArrayList();
        this.threadChecker = io.sentry.util.thread.b.d();
        this.traceOptionsRequests = true;
        this.dateProvider = new io.sentry.util.r<>(new io.sentry.util.r.a() { // from class: io.sentry.o7
            @Override // io.sentry.util.r.a
            public final Object a() {
                return q7.a();
            }
        });
        this.performanceCollectors = new ArrayList();
        this.compositePerformanceCollector = j2.g();
        this.enableTimeToFullDisplayTracing = false;
        this.fullyDisplayedReporter = i0.a();
        this.connectionStatusProvider = new k2();
        this.enabled = true;
        this.enablePrettySerializationOutput = true;
        this.sendModules = true;
        this.enableSpotlight = false;
        this.enableScopePersistence = true;
        this.ignoredCheckIns = null;
        this.ignoredSpanOrigins = null;
        this.ignoredTransactions = null;
        this.backpressureMonitor = io.sentry.backpressure.c.b();
        this.enableBackpressureHandling = true;
        this.enableAppStartProfiling = false;
        this.spanFactory = f3.b();
        this.profilingTracesHz = 101;
        this.cron = null;
        this.replayController = r2.a();
        this.distributionController = m2.a();
        this.enableScreenTracking = true;
        this.defaultScopeType = j4.ISOLATION;
        this.initPriority = p1.MEDIUM;
        this.forceInit = false;
        this.globalHubMode = null;
        this.lock = new io.sentry.util.a();
        this.openTelemetryMode = k7.AUTO;
        this.captureOpenTelemetryEvents = false;
        this.versionDetector = j3.b();
        this.profileLifecycle = u3.MANUAL;
        this.startProfilerOnAppStart = false;
        this.deadlineTimeout = 30000L;
        this.logs = new h();
        this.socketTagger = d3.c();
        this.distribution = new g();
        io.sentry.protocol.p pVarCreateSdkVersion = createSdkVersion();
        this.experimental = new f0(z15, pVarCreateSdkVersion);
        this.sessionReplay = new s7(z15, pVarCreateSdkVersion);
        this.feedbackOptions = new w6(new w6.a() { // from class: io.sentry.p7
        });
        if (z15) {
            return;
        }
        setSpanFactory(o8.a(new io.sentry.util.s(), p2.e()));
        v6 v6Var = new v6(this);
        this.executorService = v6Var;
        v6Var.b();
        copyOnWriteArrayList2.add(new UncaughtExceptionHandlerIntegration());
        copyOnWriteArrayList2.add(new ShutdownHookIntegration());
        copyOnWriteArrayList2.add(new SpotlightIntegration());
        copyOnWriteArrayList.add(new f2(this));
        copyOnWriteArrayList.add(new y(this));
        if (io.sentry.util.x.c()) {
            copyOnWriteArrayList.add(new t7());
        }
        setSentryClientName("sentry.java/8.22.0");
        setSdkVersion(pVarCreateSdkVersion);
        addPackageInfo();
    }
}
