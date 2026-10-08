package io.sentry.instrumentation.file;

import io.sentry.j1;
import io.sentry.q7;
import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes4.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final File f95072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final j1 f95073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f95074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final FileOutputStream f95075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final q7 f95076e;

    c(File file, boolean z15, j1 j1Var, FileOutputStream fileOutputStream, q7 q7Var) {
        this.f95072a = file;
        this.f95074c = z15;
        this.f95073b = j1Var;
        this.f95075d = fileOutputStream;
        this.f95076e = q7Var;
    }
}
