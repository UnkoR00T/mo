package com.google.android.libraries.vision.visionkit.pipeline.alt;

/* JADX INFO: loaded from: classes4.dex */
public enum d {
    OK("ok"),
    CANCELLED("canceled"),
    UNKNOWN("unknown"),
    INVALID_ARGUMENT("invalid argument"),
    DEADLINE_EXCEEDED("deadline exceeded"),
    NOT_FOUND("not found"),
    ALREADY_EXISTS("already exists"),
    PERMISSION_DENIED("permission denied"),
    RESOURCE_EXHAUSTED("resource exhausted"),
    FAILED_PRECONDITION("failed precondition"),
    ABORTED("aborted"),
    OUT_OF_RANGE("out of range"),
    UNIMPLEMENTED("unimplemented"),
    INTERNAL("internal"),
    UNAVAILABLE("unavailable"),
    DATA_LOSS("data loss"),
    UNAUTHENTICATED("unauthenticated");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f34665a;

    d(String str) {
        this.f34665a = str;
    }

    public final String b() {
        return this.f34665a;
    }
}
