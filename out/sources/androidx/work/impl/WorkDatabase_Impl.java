package androidx.work.impl;

import androidx.work.impl.WorkDatabase_Impl;
import cc.b0;
import cc.d0;
import cc.g;
import cc.g0;
import cc.i;
import cc.j0;
import cc.m;
import cc.n;
import cc.p;
import cc.q1;
import cc.t1;
import cc.u;
import cc.x1;
import cc.y;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import mr.c;
import oa.a0;
import oq.k;
import oq.l;
import p071kotlin.Metadata;
import pq.v;
import ta.r;
import vb.k0;
import vb.l0;
import vb.m0;
import vb.n0;
import vb.o0;
import vb.p0;
import vb.q0;
import vb.r0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ)\u0010\r\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\f0\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000b0\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\f2\u001a\u0010\u0013\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000b\u0012\u0004\u0012\u00020\u00100\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00170,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u001a0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010.R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u001d0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010.R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020 0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010.R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020#0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010.R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020&0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010.R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020)0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010.R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020<0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010.¨\u0006?"}, d2 = {"Landroidx/work/impl/WorkDatabase_Impl;", "Landroidx/work/impl/WorkDatabase;", "<init>", "()V", "Loa/a0;", "x0", "()Loa/a0;", "Landroidx/room/c;", "n", "()Landroidx/room/c;", "", "Lmr/c;", "", "z", "()Ljava/util/Map;", "", "Lra/a;", "x", "()Ljava/util/Set;", "autoMigrationSpecs", "Lra/b;", "k", "(Ljava/util/Map;)Ljava/util/List;", "Lcc/j0;", "e0", "()Lcc/j0;", "Lcc/b;", "Z", "()Lcc/b;", "Lcc/t1;", "f0", "()Lcc/t1;", "Lcc/p;", "b0", "()Lcc/p;", "Lcc/y;", "c0", "()Lcc/y;", "Lcc/d0;", "d0", "()Lcc/d0;", "Lcc/i;", "a0", "()Lcc/i;", "Loq/k;", "p", "Loq/k;", "_workSpecDao", "q", "_dependencyDao", "r", "_workTagDao", "s", "_systemIdInfoDao", "t", "_workNameDao", "u", "_workProgressDao", "v", "_preferenceDao", "Lcc/m;", "w", "_rawWorkInfoDao", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WorkDatabase_Impl extends WorkDatabase {

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final k<j0> _workSpecDao = l.a(new er.a() { // from class: vb.s0
        @Override // er.a
        public final Object a() {
            return WorkDatabase_Impl.u0(this.f205883a);
        }
    });

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final k<cc.b> _dependencyDao = l.a(new er.a() { // from class: vb.t0
        @Override // er.a
        public final Object a() {
            return WorkDatabase_Impl.o0(this.f205885a);
        }
    });

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final k<t1> _workTagDao = l.a(new er.a() { // from class: vb.u0
        @Override // er.a
        public final Object a() {
            return WorkDatabase_Impl.v0(this.f205886a);
        }
    });

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final k<p> _systemIdInfoDao = l.a(new er.a() { // from class: vb.v0
        @Override // er.a
        public final Object a() {
            return WorkDatabase_Impl.r0(this.f205891a);
        }
    });

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final k<y> _workNameDao = l.a(new er.a() { // from class: vb.w0
        @Override // er.a
        public final Object a() {
            return WorkDatabase_Impl.s0(this.f205896a);
        }
    });

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final k<d0> _workProgressDao = l.a(new er.a() { // from class: vb.x0
        @Override // er.a
        public final Object a() {
            return WorkDatabase_Impl.t0(this.f205898a);
        }
    });

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final k<i> _preferenceDao = l.a(new er.a() { // from class: vb.y0
        @Override // er.a
        public final Object a() {
            return WorkDatabase_Impl.p0(this.f205901a);
        }
    });

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final k<m> _rawWorkInfoDao = l.a(new er.a() { // from class: vb.z0
        @Override // er.a
        public final Object a() {
            return WorkDatabase_Impl.q0(this.f205903a);
        }
    });

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"androidx/work/impl/WorkDatabase_Impl$a", "Loa/a0;", "Lya/b;", "connection", "Loq/i0;", "a", "(Lya/b;)V", "b", "f", "g", "i", "h", "Loa/a0$a;", "j", "(Lya/b;)Loa/a0$a;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends a0 {
        a() {
            super(24, "08b926448d86528e697981ddd30459f7", "149fd8ad55885d3fe3549a37a0163243");
        }

        @Override // oa.a0
        public void a(ya.b connection) throws Exception {
            ya.a.a(connection, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            ya.a.a(connection, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            ya.a.a(connection, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            ya.a.a(connection, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            ya.a.a(connection, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            ya.a.a(connection, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
            ya.a.a(connection, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            ya.a.a(connection, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            ya.a.a(connection, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            ya.a.a(connection, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            ya.a.a(connection, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            ya.a.a(connection, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            ya.a.a(connection, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            ya.a.a(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            ya.a.a(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')");
        }

        @Override // oa.a0
        public void b(ya.b connection) throws Exception {
            ya.a.a(connection, "DROP TABLE IF EXISTS `Dependency`");
            ya.a.a(connection, "DROP TABLE IF EXISTS `WorkSpec`");
            ya.a.a(connection, "DROP TABLE IF EXISTS `WorkTag`");
            ya.a.a(connection, "DROP TABLE IF EXISTS `SystemIdInfo`");
            ya.a.a(connection, "DROP TABLE IF EXISTS `WorkName`");
            ya.a.a(connection, "DROP TABLE IF EXISTS `WorkProgress`");
            ya.a.a(connection, "DROP TABLE IF EXISTS `Preference`");
        }

        @Override // oa.a0
        public void f(ya.b connection) {
        }

        @Override // oa.a0
        public void g(ya.b connection) throws Exception {
            ya.a.a(connection, "PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.M(connection);
        }

        @Override // oa.a0
        public void h(ya.b connection) {
        }

        @Override // oa.a0
        public void i(ya.b connection) {
            ta.a.a(connection);
        }

        @Override // oa.a0
        public a0.a j(ya.b connection) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("work_spec_id", new r.a("work_spec_id", "TEXT", true, 1, null, 1));
            linkedHashMap.put("prerequisite_id", new r.a("prerequisite_id", "TEXT", true, 2, null, 1));
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(new r.c("WorkSpec", "CASCADE", "CASCADE", v.e("work_spec_id"), v.e("id")));
            linkedHashSet.add(new r.c("WorkSpec", "CASCADE", "CASCADE", v.e("prerequisite_id"), v.e("id")));
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            linkedHashSet2.add(new r.d("index_Dependency_work_spec_id", false, v.e("work_spec_id"), v.e("ASC")));
            linkedHashSet2.add(new r.d("index_Dependency_prerequisite_id", false, v.e("prerequisite_id"), v.e("ASC")));
            r rVar = new r("Dependency", linkedHashMap, linkedHashSet, linkedHashSet2);
            r.Companion companion = r.INSTANCE;
            r rVarA = companion.a(connection, "Dependency");
            if (!rVar.equals(rVarA)) {
                return new a0.a(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + rVar + "\n Found:\n" + rVarA);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("id", new r.a("id", "TEXT", true, 1, null, 1));
            linkedHashMap2.put("state", new r.a("state", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("worker_class_name", new r.a("worker_class_name", "TEXT", true, 0, null, 1));
            linkedHashMap2.put("input_merger_class_name", new r.a("input_merger_class_name", "TEXT", true, 0, null, 1));
            linkedHashMap2.put("input", new r.a("input", "BLOB", true, 0, null, 1));
            linkedHashMap2.put("output", new r.a("output", "BLOB", true, 0, null, 1));
            linkedHashMap2.put("initial_delay", new r.a("initial_delay", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("interval_duration", new r.a("interval_duration", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("flex_duration", new r.a("flex_duration", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("run_attempt_count", new r.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("backoff_policy", new r.a("backoff_policy", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("backoff_delay_duration", new r.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("last_enqueue_time", new r.a("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
            linkedHashMap2.put("minimum_retention_duration", new r.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("schedule_requested_at", new r.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("run_in_foreground", new r.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("out_of_quota_policy", new r.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("period_count", new r.a("period_count", "INTEGER", true, 0, d.f37012h1, 1));
            linkedHashMap2.put("generation", new r.a("generation", "INTEGER", true, 0, d.f37012h1, 1));
            linkedHashMap2.put("next_schedule_time_override", new r.a("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
            linkedHashMap2.put("next_schedule_time_override_generation", new r.a("next_schedule_time_override_generation", "INTEGER", true, 0, d.f37012h1, 1));
            linkedHashMap2.put("stop_reason", new r.a("stop_reason", "INTEGER", true, 0, "-256", 1));
            linkedHashMap2.put("trace_tag", new r.a("trace_tag", "TEXT", false, 0, null, 1));
            linkedHashMap2.put("backoff_on_system_interruptions", new r.a("backoff_on_system_interruptions", "INTEGER", false, 0, null, 1));
            linkedHashMap2.put("required_network_type", new r.a("required_network_type", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("required_network_request", new r.a("required_network_request", "BLOB", true, 0, "x''", 1));
            linkedHashMap2.put("requires_charging", new r.a("requires_charging", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("requires_device_idle", new r.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("requires_battery_not_low", new r.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("requires_storage_not_low", new r.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("trigger_content_update_delay", new r.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("trigger_max_content_delay", new r.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            linkedHashMap2.put("content_uri_triggers", new r.a("content_uri_triggers", "BLOB", true, 0, null, 1));
            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
            LinkedHashSet linkedHashSet4 = new LinkedHashSet();
            linkedHashSet4.add(new r.d("index_WorkSpec_schedule_requested_at", false, v.e("schedule_requested_at"), v.e("ASC")));
            linkedHashSet4.add(new r.d("index_WorkSpec_last_enqueue_time", false, v.e("last_enqueue_time"), v.e("ASC")));
            r rVar2 = new r("WorkSpec", linkedHashMap2, linkedHashSet3, linkedHashSet4);
            r rVarA2 = companion.a(connection, "WorkSpec");
            if (!rVar2.equals(rVarA2)) {
                return new a0.a(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + rVar2 + "\n Found:\n" + rVarA2);
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put("tag", new r.a("tag", "TEXT", true, 1, null, 1));
            linkedHashMap3.put("work_spec_id", new r.a("work_spec_id", "TEXT", true, 2, null, 1));
            LinkedHashSet linkedHashSet5 = new LinkedHashSet();
            linkedHashSet5.add(new r.c("WorkSpec", "CASCADE", "CASCADE", v.e("work_spec_id"), v.e("id")));
            LinkedHashSet linkedHashSet6 = new LinkedHashSet();
            linkedHashSet6.add(new r.d("index_WorkTag_work_spec_id", false, v.e("work_spec_id"), v.e("ASC")));
            r rVar3 = new r("WorkTag", linkedHashMap3, linkedHashSet5, linkedHashSet6);
            r rVarA3 = companion.a(connection, "WorkTag");
            if (!rVar3.equals(rVarA3)) {
                return new a0.a(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + rVar3 + "\n Found:\n" + rVarA3);
            }
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            linkedHashMap4.put("work_spec_id", new r.a("work_spec_id", "TEXT", true, 1, null, 1));
            linkedHashMap4.put("generation", new r.a("generation", "INTEGER", true, 2, d.f37012h1, 1));
            linkedHashMap4.put("system_id", new r.a("system_id", "INTEGER", true, 0, null, 1));
            LinkedHashSet linkedHashSet7 = new LinkedHashSet();
            linkedHashSet7.add(new r.c("WorkSpec", "CASCADE", "CASCADE", v.e("work_spec_id"), v.e("id")));
            r rVar4 = new r("SystemIdInfo", linkedHashMap4, linkedHashSet7, new LinkedHashSet());
            r rVarA4 = companion.a(connection, "SystemIdInfo");
            if (!rVar4.equals(rVarA4)) {
                return new a0.a(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + rVar4 + "\n Found:\n" + rVarA4);
            }
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            linkedHashMap5.put("name", new r.a("name", "TEXT", true, 1, null, 1));
            linkedHashMap5.put("work_spec_id", new r.a("work_spec_id", "TEXT", true, 2, null, 1));
            LinkedHashSet linkedHashSet8 = new LinkedHashSet();
            linkedHashSet8.add(new r.c("WorkSpec", "CASCADE", "CASCADE", v.e("work_spec_id"), v.e("id")));
            LinkedHashSet linkedHashSet9 = new LinkedHashSet();
            linkedHashSet9.add(new r.d("index_WorkName_work_spec_id", false, v.e("work_spec_id"), v.e("ASC")));
            r rVar5 = new r("WorkName", linkedHashMap5, linkedHashSet8, linkedHashSet9);
            r rVarA5 = companion.a(connection, "WorkName");
            if (!rVar5.equals(rVarA5)) {
                return new a0.a(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + rVar5 + "\n Found:\n" + rVarA5);
            }
            LinkedHashMap linkedHashMap6 = new LinkedHashMap();
            linkedHashMap6.put("work_spec_id", new r.a("work_spec_id", "TEXT", true, 1, null, 1));
            linkedHashMap6.put("progress", new r.a("progress", "BLOB", true, 0, null, 1));
            LinkedHashSet linkedHashSet10 = new LinkedHashSet();
            linkedHashSet10.add(new r.c("WorkSpec", "CASCADE", "CASCADE", v.e("work_spec_id"), v.e("id")));
            r rVar6 = new r("WorkProgress", linkedHashMap6, linkedHashSet10, new LinkedHashSet());
            r rVarA6 = companion.a(connection, "WorkProgress");
            if (!rVar6.equals(rVarA6)) {
                return new a0.a(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + rVar6 + "\n Found:\n" + rVarA6);
            }
            LinkedHashMap linkedHashMap7 = new LinkedHashMap();
            linkedHashMap7.put("key", new r.a("key", "TEXT", true, 1, null, 1));
            linkedHashMap7.put("long_value", new r.a("long_value", "INTEGER", false, 0, null, 1));
            r rVar7 = new r("Preference", linkedHashMap7, new LinkedHashSet(), new LinkedHashSet());
            r rVarA7 = companion.a(connection, "Preference");
            if (rVar7.equals(rVarA7)) {
                return new a0.a(true, null);
            }
            return new a0.a(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + rVar7 + "\n Found:\n" + rVarA7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g o0(WorkDatabase_Impl workDatabase_Impl) {
        return new g(workDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cc.l p0(WorkDatabase_Impl workDatabase_Impl) {
        return new cc.l(workDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n q0(WorkDatabase_Impl workDatabase_Impl) {
        return new n(workDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u r0(WorkDatabase_Impl workDatabase_Impl) {
        return new u(workDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b0 s0(WorkDatabase_Impl workDatabase_Impl) {
        return new b0(workDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g0 t0(WorkDatabase_Impl workDatabase_Impl) {
        return new g0(workDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q1 u0(WorkDatabase_Impl workDatabase_Impl) {
        return new q1(workDatabase_Impl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x1 v0(WorkDatabase_Impl workDatabase_Impl) {
        return new x1(workDatabase_Impl);
    }

    @Override // androidx.work.impl.WorkDatabase
    public cc.b Z() {
        return this._dependencyDao.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public i a0() {
        return this._preferenceDao.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public p b0() {
        return this._systemIdInfoDao.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public y c0() {
        return this._workNameDao.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public d0 d0() {
        return this._workProgressDao.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public j0 e0() {
        return this._workSpecDao.getValue();
    }

    @Override // androidx.work.impl.WorkDatabase
    public t1 f0() {
        return this._workTagDao.getValue();
    }

    @Override // oa.u
    public List<ra.b> k(Map<c<? extends ra.a>, ? extends ra.a> autoMigrationSpecs) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new vb.j0());
        arrayList.add(new k0());
        arrayList.add(new l0());
        arrayList.add(new m0());
        arrayList.add(new n0());
        arrayList.add(new o0());
        arrayList.add(new p0());
        arrayList.add(new q0());
        arrayList.add(new r0());
        return arrayList;
    }

    @Override // oa.u
    protected androidx.room.c n() {
        return new androidx.room.c(this, new LinkedHashMap(), new LinkedHashMap(), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // oa.u
    public Set<c<? extends ra.a>> x() {
        return new LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // oa.u
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public a0 o() {
        return new a();
    }

    @Override // oa.u
    protected Map<c<?>, List<c<?>>> z() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(fr.q0.c(j0.class), q1.INSTANCE.a());
        linkedHashMap.put(fr.q0.c(cc.b.class), g.INSTANCE.a());
        linkedHashMap.put(fr.q0.c(t1.class), x1.INSTANCE.a());
        linkedHashMap.put(fr.q0.c(p.class), u.INSTANCE.a());
        linkedHashMap.put(fr.q0.c(y.class), b0.INSTANCE.a());
        linkedHashMap.put(fr.q0.c(d0.class), g0.INSTANCE.a());
        linkedHashMap.put(fr.q0.c(i.class), cc.l.INSTANCE.a());
        linkedHashMap.put(fr.q0.c(m.class), n.INSTANCE.a());
        return linkedHashMap;
    }
}
