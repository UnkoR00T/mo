package gg1;

import fr.t;
import java.util.Set;
import jb4.PayloadErrorData;
import mx.Label;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import pq.e1;
import pq.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u001a\u001c\u0018B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lgg1/k;", "Lxw/f;", "Lgg1/k$b;", "Ljb4/b;", "Lib4/c;", "errorMapper", "Lmx/c;", "labelProvider", "<init>", "(Lib4/c;Lmx/c;)V", "Ldx/b;", "Ljb4/f;", "l", "(Ldx/b;)Ljb4/f;", "params", "m", "(Lgg1/k$b;)Ljb4/b;", "domainError", "Lgg1/k$c;", "z", "(Ldx/b;)Lgg1/k$c;", "", "x", "(Ldx/b;)Z", "a", "Lib4/c;", "b", "Lmx/c;", "c", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k implements xw.f<Params, jb4.b> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f72875d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Set<String> f72876e = e1.i("APPLICATION_ORDER_FAILED", "DIGITAL_SIGNATURE_COMMUNICATION");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: gg1.k$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u0016\u0010\u001c¨\u0006 "}, d2 = {"Lgg1/k$b;", "", "Lgg1/k$c;", "error", "Lkotlin/Function0;", "Loq/i0;", "generateXml", "Lkotlin/Function1;", "", "sendApplication", "closeProcess", "<init>", "(Lgg1/k$c;Ler/a;Ler/l;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgg1/k$c;", "b", "()Lgg1/k$c;", "Ler/a;", "c", "()Ler/a;", "Ler/l;", "d", "()Ler/l;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final c error;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> generateXml;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, i0> sendApplication;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeProcess;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(c cVar, er.a<i0> aVar, er.l<? super String, i0> lVar, er.a<i0> aVar2) {
            this.error = cVar;
            this.generateXml = aVar;
            this.sendApplication = lVar;
            this.closeProcess = aVar2;
        }

        public final er.a<i0> a() {
            return this.closeProcess;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final c getError() {
            return this.error;
        }

        public final er.a<i0> c() {
            return this.generateXml;
        }

        public final er.l<String, i0> d() {
            return this.sendApplication;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.error, params.error) && t.c(this.generateXml, params.generateXml) && t.c(this.sendApplication, params.sendApplication) && t.c(this.closeProcess, params.closeProcess);
        }

        public int hashCode() {
            return (((((this.error.hashCode() * 31) + this.generateXml.hashCode()) * 31) + this.sendApplication.hashCode()) * 31) + this.closeProcess.hashCode();
        }

        public String toString() {
            return "Params(error=" + this.error + ", generateXml=" + this.generateXml + ", sendApplication=" + this.sendApplication + ", closeProcess=" + this.closeProcess + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\u0006\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lgg1/k$c;", "", "Ldx/b;", "error", "<init>", "(Ldx/b;)V", "a", "Ldx/b;", "getError", "()Ldx/b;", "c", "d", "b", "e", "Lgg1/k$c$a;", "Lgg1/k$c$b;", "Lgg1/k$c$c;", "Lgg1/k$c$d;", "Lgg1/k$c$e;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final dx.b error;

        /* JADX INFO: renamed from: gg1.k$c$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lgg1/k$c$a;", "Lgg1/k$c;", "Ldx/b;", "error", "<init>", "(Ldx/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ldx/b;", "a", "()Ldx/b;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class BusinessError extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final dx.b error;

            public BusinessError(dx.b bVar) {
                super(bVar, null);
                this.error = bVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public dx.b getError() {
                return this.error;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof BusinessError) && t.c(this.error, ((BusinessError) other).error);
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "BusinessError(error=" + this.error + ')';
            }
        }

        /* JADX INFO: renamed from: gg1.k$c$b, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lgg1/k$c$b;", "Lgg1/k$c;", "Ldx/b;", "error", "<init>", "(Ldx/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ldx/b;", "a", "()Ldx/b;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class GenerateXml extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final dx.b error;

            public GenerateXml(dx.b bVar) {
                super(bVar, null);
                this.error = bVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public dx.b getError() {
                return this.error;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof GenerateXml) && t.c(this.error, ((GenerateXml) other).error);
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "GenerateXml(error=" + this.error + ')';
            }
        }

        /* JADX INFO: renamed from: gg1.k$c$c, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lgg1/k$c$c;", "Lgg1/k$c;", "Ldx/b;", "error", "<init>", "(Ldx/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ldx/b;", "a", "()Ldx/b;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class InvalidDataError extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final dx.b error;

            public InvalidDataError(dx.b bVar) {
                super(bVar, null);
                this.error = bVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public dx.b getError() {
                return this.error;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof InvalidDataError) && t.c(this.error, ((InvalidDataError) other).error);
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "InvalidDataError(error=" + this.error + ')';
            }
        }

        /* JADX INFO: renamed from: gg1.k$c$d, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lgg1/k$c$d;", "Lgg1/k$c;", "Ldx/b;", "error", "<init>", "(Ldx/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ldx/b;", "a", "()Ldx/b;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class OpenPreviewError extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final dx.b error;

            public OpenPreviewError(dx.b bVar) {
                super(bVar, null);
                this.error = bVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public dx.b getError() {
                return this.error;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OpenPreviewError) && t.c(this.error, ((OpenPreviewError) other).error);
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "OpenPreviewError(error=" + this.error + ')';
            }
        }

        /* JADX INFO: renamed from: gg1.k$c$e, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0004¨\u0006\u0016"}, d2 = {"Lgg1/k$c$e;", "Lgg1/k$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ldx/b;", "b", "Ldx/b;", "()Ldx/b;", "error", "c", "Ljava/lang/String;", "a", "applicationXml", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SignXml extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final dx.b error;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final String applicationXml;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getApplicationXml() {
                return this.applicationXml;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public dx.b getError() {
                return this.error;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SignXml)) {
                    return false;
                }
                SignXml signXml = (SignXml) other;
                return t.c(this.error, signXml.error) && t.c(this.applicationXml, signXml.applicationXml);
            }

            public int hashCode() {
                return (this.error.hashCode() * 31) + this.applicationXml.hashCode();
            }

            public String toString() {
                return "SignXml(error=" + this.error + ", applicationXml=" + this.applicationXml + ')';
            }
        }

        public /* synthetic */ c(dx.b bVar, fr.k kVar) {
            this(bVar);
        }

        private c(dx.b bVar) {
            this.error = bVar;
        }
    }

    public k(ib4.c cVar, mx.c cVar2) {
        this.errorMapper = cVar;
        this.labelProvider = cVar2;
    }

    private final PayloadErrorData l(dx.b bVar) {
        dx.b.g.Http http = bVar instanceof dx.b.g.Http ? (dx.b.g.Http) bVar : null;
        if (http != null) {
            return (PayloadErrorData) http.b();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Params params, ib4.c.b bVar) {
        if (!(bVar instanceof ib4.c.b.a.Close) && !(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary) && !t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            if (!t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new p();
            }
            params.c().a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(Params params, c cVar, ib4.c.b bVar) {
        if (!(bVar instanceof ib4.c.b.a.Close) && !(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary) && !t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            if (!t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new p();
            }
            params.d().b(((c.SignXml) cVar).getApplicationXml());
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(ib4.c.b bVar) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(Params params, ib4.c.b bVar) {
        if (!(bVar instanceof ib4.c.b.a.Close) && !(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary) && !t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            if (!t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                throw new p();
            }
            params.a().a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(Params params, ib4.c.b bVar) {
        if (!(bVar instanceof ib4.c.b.a.Close)) {
            if (bVar instanceof ib4.c.b.a.Primary) {
                params.c().a();
            } else if (!(bVar instanceof ib4.c.b.a.Secondary) && !t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a) && !t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new p();
            }
        }
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public jb4.b b(final Params params) {
        final c error = params.getError();
        if (error instanceof c.GenerateXml) {
            return this.errorMapper.b(new ib4.c.Params(((c.GenerateXml) error).getError(), false, new er.l() { // from class: gg1.f
                @Override // er.l
                public final Object b(Object obj) {
                    return k.q(params, (ib4.c.b) obj);
                }
            }, 2, null));
        }
        if (error instanceof c.SignXml) {
            return this.errorMapper.b(new ib4.c.Params(((c.SignXml) error).getError(), false, new er.l() { // from class: gg1.g
                @Override // er.l
                public final Object b(Object obj) {
                    return k.r(params, error, (ib4.c.b) obj);
                }
            }, 2, null));
        }
        if (error instanceof c.OpenPreviewError) {
            return this.errorMapper.b(new ib4.c.Params(((c.OpenPreviewError) error).getError(), false, new er.l() { // from class: gg1.h
                @Override // er.l
                public final Object b(Object obj) {
                    return k.s((ib4.c.b) obj);
                }
            }, 2, null));
        }
        if (error instanceof c.InvalidDataError) {
            return this.errorMapper.b(new ib4.c.Params(((c.InvalidDataError) error).getError(), false, new er.l() { // from class: gg1.i
                @Override // er.l
                public final Object b(Object obj) {
                    return k.u(params, (ib4.c.b) obj);
                }
            }, 2, null));
        }
        if (error instanceof c.BusinessError) {
            return this.errorMapper.b(new ib4.c.Params(((c.BusinessError) error).getError(), false, new er.l() { // from class: gg1.j
                @Override // er.l
                public final Object b(Object obj) {
                    return k.v(params, (ib4.c.b) obj);
                }
            }, 2, null));
        }
        throw new p();
    }

    public final boolean x(dx.b domainError) {
        Set<String> set = f72876e;
        PayloadErrorData payloadErrorDataL = l(domainError);
        return v.c0(set, payloadErrorDataL != null ? payloadErrorDataL.getCode() : null);
    }

    public final c z(dx.b domainError) {
        Label labelC;
        Label labelC2;
        String message;
        String title;
        if (!(domainError instanceof dx.b.g.Http)) {
            return new c.GenerateXml(domainError);
        }
        PayloadErrorData payloadErrorDataL = l(domainError);
        if (!v.c0(f72876e, payloadErrorDataL != null ? payloadErrorDataL.getCode() : null)) {
            return new c.GenerateXml(domainError);
        }
        dx.b.f fVar = dx.b.f.FAILURE;
        if (payloadErrorDataL == null || (title = payloadErrorDataL.getTitle()) == null || (labelC = mx.b.b(title, "errorTitle")) == null) {
            labelC = Label.INSTANCE.c();
        }
        Label label = labelC;
        if (payloadErrorDataL == null || (message = payloadErrorDataL.getMessage()) == null || (labelC2 = mx.b.b(message, "errorMessage")) == null) {
            labelC2 = Label.INSTANCE.c();
        }
        return new c.BusinessError(new dx.b.Business(null, fVar, label, labelC2, null, this.labelProvider.c(ha1.a.f82387e0), this.labelProvider.c(ha1.a.f82450m), 17, null));
    }
}
