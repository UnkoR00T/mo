package org.conscrypt.metrics;

import org.conscrypt.Platform;
import org.conscrypt.ct.LogStore;
import org.conscrypt.ct.PolicyCompliance;
import org.conscrypt.ct.VerificationResult;

/* JADX INFO: loaded from: classes5.dex */
public final class StatsLogImpl implements StatsLog {
    private static final StatsLog INSTANCE = new StatsLogImpl();
    private static final boolean sdkVersionBiggerThan32 = Platform.isSdkGreater(32);

    /* JADX INFO: renamed from: org.conscrypt.metrics.StatsLogImpl$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$conscrypt$ct$LogStore$State;

        static {
            int[] iArr = new int[LogStore.State.values().length];
            $SwitchMap$org$conscrypt$ct$LogStore$State = iArr;
            try {
                iArr[LogStore.State.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$conscrypt$ct$LogStore$State[LogStore.State.LOADED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$conscrypt$ct$LogStore$State[LogStore.State.NOT_FOUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$conscrypt$ct$LogStore$State[LogStore.State.MALFORMED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$conscrypt$ct$LogStore$State[LogStore.State.COMPLIANT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$conscrypt$ct$LogStore$State[LogStore.State.NON_COMPLIANT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private StatsLogImpl() {
    }

    public static StatsLog getInstance() {
        return INSTANCE;
    }

    private static int logStoreStateToMetricsState(LogStore.State state) {
        int i15 = AnonymousClass1.$SwitchMap$org$conscrypt$ct$LogStore$State[state.ordinal()];
        if (i15 == 3) {
            return 2;
        }
        if (i15 == 4) {
            return 3;
        }
        if (i15 != 5) {
            return i15 != 6 ? 0 : 4;
        }
        return 1;
    }

    private static int policyComplianceToMetrics(VerificationResult verificationResult, PolicyCompliance policyCompliance) {
        if (policyCompliance == PolicyCompliance.COMPLY) {
            return 1;
        }
        if (verificationResult.getValidSCTs().size() == 0) {
            return 3;
        }
        return (policyCompliance == PolicyCompliance.NOT_ENOUGH_SCTS || policyCompliance == PolicyCompliance.NOT_ENOUGH_DIVERSE_SCTS) ? 4 : 0;
    }

    private void write(int i15, boolean z15, int i16, int i17, int i18, int i19, int[] iArr) {
        if (sdkVersionBiggerThan32) {
            ConscryptStatsLog.write(i15, z15, i16, i17, i18, i19, iArr);
            return;
        }
        ReflexiveStatsEvent.Builder builderNewBuilder = ReflexiveStatsEvent.newBuilder();
        builderNewBuilder.writeInt(i15);
        builderNewBuilder.writeBoolean(z15);
        builderNewBuilder.writeInt(i16);
        builderNewBuilder.writeInt(i17);
        builderNewBuilder.writeInt(i18);
        builderNewBuilder.writeInt(i19);
        builderNewBuilder.usePooledBuffer();
        ReflexiveStatsLog.write(builderNewBuilder.build());
    }

    @Override // org.conscrypt.metrics.StatsLog
    public void countTlsHandshake(boolean z15, String str, String str2, long j15) {
        write(ConscryptStatsLog.TLS_HANDSHAKE_REPORTED, z15, Protocol.forName(str).getId(), CipherSuite.forName(str2).getId(), (int) j15, Platform.getStatsSource().getId(), Platform.getUids());
    }

    @Override // org.conscrypt.metrics.StatsLog
    public void reportCTVerificationResult(LogStore logStore, VerificationResult verificationResult, PolicyCompliance policyCompliance, CertificateTransparencyVerificationReason certificateTransparencyVerificationReason) {
        if (logStore.getState() == LogStore.State.NOT_FOUND || logStore.getState() == LogStore.State.MALFORMED) {
            write(ConscryptStatsLog.CERTIFICATE_TRANSPARENCY_VERIFICATION_REPORTED, 5, certificateTransparencyVerificationReason.getId(), 0, 0, 0, 0, 0, 0);
        } else if (logStore.getState() == LogStore.State.NON_COMPLIANT) {
            write(ConscryptStatsLog.CERTIFICATE_TRANSPARENCY_VERIFICATION_REPORTED, 6, certificateTransparencyVerificationReason.getId(), 0, 0, 0, 0, 0, 0);
        } else if (logStore.getState() == LogStore.State.COMPLIANT) {
            write(ConscryptStatsLog.CERTIFICATE_TRANSPARENCY_VERIFICATION_REPORTED, policyComplianceToMetrics(verificationResult, policyCompliance), certificateTransparencyVerificationReason.getId(), logStore.getCompatVersion(), logStore.getMajorVersion(), logStore.getMinorVersion(), verificationResult.numCertSCTs(), verificationResult.numOCSPSCTs(), verificationResult.numTlsSCTs());
        }
    }

    @Override // org.conscrypt.metrics.StatsLog
    public void updateCTLogListStatusChanged(LogStore logStore) {
        write(ConscryptStatsLog.CERTIFICATE_TRANSPARENCY_LOG_LIST_STATE_CHANGED, logStoreStateToMetricsState(logStore.getState()), logStore.getCompatVersion(), logStore.getMinCompatVersionAvailable(), logStore.getMajorVersion(), logStore.getMinorVersion());
    }

    private void write(int i15, int i16, int i17, int i18, int i19, int i25) {
        ConscryptStatsLog.write(i15, i16, i17, i18, i19, i25);
    }

    private void write(int i15, int i16, int i17, int i18, int i19, int i25, int i26, int i27, int i28) {
        ConscryptStatsLog.write(i15, i16, i17, i18, i19, i25, i26, i27, i28);
    }
}
