package io.sentry.android.core.internal.threaddump;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<? extends a> f93931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f93932b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f93933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f93934d;

    public b(ArrayList<? extends a> arrayList) {
        this.f93931a = arrayList;
        this.f93933c = arrayList.size();
    }

    public static b c(BufferedReader bufferedReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        int i15 = 0;
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return new b(arrayList);
            }
            i15++;
            arrayList.add(new a(i15, line));
        }
    }

    public boolean a() {
        return this.f93934d < this.f93933c;
    }

    public a b() {
        int i15 = this.f93934d;
        if (i15 < this.f93932b || i15 >= this.f93933c) {
            return null;
        }
        ArrayList<? extends a> arrayList = this.f93931a;
        this.f93934d = i15 + 1;
        return arrayList.get(i15);
    }

    public void d() {
        this.f93934d--;
    }
}
