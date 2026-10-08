package com.pl.pwpw.mobile.edoapp.edoLibrary.messages;

import dv.e;
import fr.t;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import zp.a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0086\b\u0018\u0000 <2\u00020\u0001:\u0001=Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0015J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0015J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0015J\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0015J\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u0017J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u0017J\u0010\u0010\"\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0092\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0015J\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010\u0017J\u001a\u0010*\u001a\u00020\u00102\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b0\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b1\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b2\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b3\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b4\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b5\u0010\u0015R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b6\u0010\u0015R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b7\u0010\u0015R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b8\u0010\u0017R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010.\u001a\u0004\b9\u0010\u0017R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010:\u001a\u0004\b;\u0010#¨\u0006>"}, d2 = {"Lcom/pl/pwpw/mobile/edoapp/edoLibrary/messages/ProcessFinishedMessage;", "Lcom/pl/pwpw/mobile/edoapp/edoLibrary/messages/IMessage;", "", "content", "", "code", "certificate", "dG1", "dG2", "dG11", "dG12", "dG13", "sOD", "signedData", "certificatePinCounter", "certificatePukCounter", "", "certificateIsActivated", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZ)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "()Z", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZ)Lcom/pl/pwpw/mobile/edoapp/edoLibrary/messages/ProcessFinishedMessage;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getContent", "I", "getCode", "getCertificate", "getDG1", "getDG2", "getDG11", "getDG12", "getDG13", "getSOD", "getSignedData", "getCertificatePinCounter", "getCertificatePukCounter", "Z", "getCertificateIsActivated", "Companion", "nuL/e", "edoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ProcessFinishedMessage implements IMessage {
    public static final e Companion = new e();
    private final String certificate;
    private final boolean certificateIsActivated;
    private final int certificatePinCounter;
    private final int certificatePukCounter;
    private final int code;
    private final String content;
    private final String dG1;
    private final String dG11;
    private final String dG12;
    private final String dG13;
    private final String dG2;
    private final String sOD;
    private final String signedData;

    public ProcessFinishedMessage(String str, int i15, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i16, int i17, boolean z15) {
        this.content = str;
        this.code = i15;
        this.certificate = str2;
        this.dG1 = str3;
        this.dG2 = str4;
        this.dG11 = str5;
        this.dG12 = str6;
        this.dG13 = str7;
        this.sOD = str8;
        this.signedData = str9;
        this.certificatePinCounter = i16;
        this.certificatePukCounter = i17;
        this.certificateIsActivated = z15;
    }

    public static /* synthetic */ ProcessFinishedMessage copy$default(ProcessFinishedMessage processFinishedMessage, String str, int i15, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i16, int i17, boolean z15, int i18, Object obj) {
        if ((i18 & 1) != 0) {
            str = processFinishedMessage.content;
        }
        return processFinishedMessage.copy(str, (i18 & 2) != 0 ? processFinishedMessage.code : i15, (i18 & 4) != 0 ? processFinishedMessage.certificate : str2, (i18 & 8) != 0 ? processFinishedMessage.dG1 : str3, (i18 & 16) != 0 ? processFinishedMessage.dG2 : str4, (i18 & 32) != 0 ? processFinishedMessage.dG11 : str5, (i18 & 64) != 0 ? processFinishedMessage.dG12 : str6, (i18 & 128) != 0 ? processFinishedMessage.dG13 : str7, (i18 & 256) != 0 ? processFinishedMessage.sOD : str8, (i18 & 512) != 0 ? processFinishedMessage.signedData : str9, (i18 & 1024) != 0 ? processFinishedMessage.certificatePinCounter : i16, (i18 & 2048) != 0 ? processFinishedMessage.certificatePukCounter : i17, (i18 & PKIFailureInfo.certConfirmed) != 0 ? processFinishedMessage.certificateIsActivated : z15);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSignedData() {
        return this.signedData;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getCertificatePinCounter() {
        return this.certificatePinCounter;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getCertificatePukCounter() {
        return this.certificatePukCounter;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getCertificateIsActivated() {
        return this.certificateIsActivated;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCertificate() {
        return this.certificate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDG1() {
        return this.dG1;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDG2() {
        return this.dG2;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDG11() {
        return this.dG11;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDG12() {
        return this.dG12;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDG13() {
        return this.dG13;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSOD() {
        return this.sOD;
    }

    public final ProcessFinishedMessage copy(String content, int code, String certificate, String dG1, String dG2, String dG11, String dG12, String dG13, String sOD, String signedData, int certificatePinCounter, int certificatePukCounter, boolean certificateIsActivated) {
        return new ProcessFinishedMessage(content, code, certificate, dG1, dG2, dG11, dG12, dG13, sOD, signedData, certificatePinCounter, certificatePukCounter, certificateIsActivated);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProcessFinishedMessage)) {
            return false;
        }
        ProcessFinishedMessage processFinishedMessage = (ProcessFinishedMessage) other;
        return t.c(this.content, processFinishedMessage.content) && this.code == processFinishedMessage.code && t.c(this.certificate, processFinishedMessage.certificate) && t.c(this.dG1, processFinishedMessage.dG1) && t.c(this.dG2, processFinishedMessage.dG2) && t.c(this.dG11, processFinishedMessage.dG11) && t.c(this.dG12, processFinishedMessage.dG12) && t.c(this.dG13, processFinishedMessage.dG13) && t.c(this.sOD, processFinishedMessage.sOD) && t.c(this.signedData, processFinishedMessage.signedData) && this.certificatePinCounter == processFinishedMessage.certificatePinCounter && this.certificatePukCounter == processFinishedMessage.certificatePukCounter && this.certificateIsActivated == processFinishedMessage.certificateIsActivated;
    }

    public final String getCertificate() {
        return this.certificate;
    }

    public final boolean getCertificateIsActivated() {
        return this.certificateIsActivated;
    }

    public final int getCertificatePinCounter() {
        return this.certificatePinCounter;
    }

    public final int getCertificatePukCounter() {
        return this.certificatePukCounter;
    }

    @Override // com.pl.pwpw.mobile.edoapp.edoLibrary.messages.IMessage
    public int getCode() {
        return this.code;
    }

    @Override // com.pl.pwpw.mobile.edoapp.edoLibrary.messages.IMessage
    public String getContent() {
        return this.content;
    }

    public final String getDG1() {
        return this.dG1;
    }

    public final String getDG11() {
        return this.dG11;
    }

    public final String getDG12() {
        return this.dG12;
    }

    public final String getDG13() {
        return this.dG13;
    }

    public final String getDG2() {
        return this.dG2;
    }

    public final String getSOD() {
        return this.sOD;
    }

    public final String getSignedData() {
        return this.signedData;
    }

    public int hashCode() {
        return Boolean.hashCode(this.certificateIsActivated) + ((Integer.hashCode(this.certificatePukCounter) + ((Integer.hashCode(this.certificatePinCounter) + a.a(this.signedData, a.a(this.sOD, a.a(this.dG13, a.a(this.dG12, a.a(this.dG11, a.a(this.dG2, a.a(this.dG1, a.a(this.certificate, (Integer.hashCode(this.code) + (this.content.hashCode() * 31)) * 31, 31), 31), 31), 31), 31), 31), 31), 31)) * 31)) * 31);
    }

    public String toString() {
        return "ProcessFinishedMessage(content=" + this.content + ", code=" + this.code + ", certificate=" + this.certificate + ", dG1=" + this.dG1 + ", dG2=" + this.dG2 + ", dG11=" + this.dG11 + ", dG12=" + this.dG12 + ", dG13=" + this.dG13 + ", sOD=" + this.sOD + ", signedData=" + this.signedData + ", certificatePinCounter=" + this.certificatePinCounter + ", certificatePukCounter=" + this.certificatePukCounter + ", certificateIsActivated=" + this.certificateIsActivated + ')';
    }
}
